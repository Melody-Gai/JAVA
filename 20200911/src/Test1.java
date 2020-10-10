# -*- coding: utf-8 -*-
        """
        Created on Fri Sep 11 20:18:20 2020

@author: JChonpca_Huang
        """
        import numpy as np
        import pandas as pd
        import matplotlib.pyplot as plt
        import numba as nb

        data = pd.read_excel('data.xlsx')
        data = np.array(data)

        plt.plot(data[:,0]*(1/0.000001),data[:,1])
        plt.show()


@nb.njit
def bound_constract(edge1,edge2):

        alpha = 1
        beta = 1

        t = 10
        X = 5
        Y = 5

        delta_t = 0.0001
        delta_X = 0.1
        delta_Y = 0.1


        T_matrix = np.zeros((2+int(X/delta_X),2+int(Y/delta_Y),1+int(t/delta_t)))

        #Bound
        T_matrix[0,:,:] = 25
        T_matrix[-1,:,:] = 25
        T_matrix[:,0,:] = edge1
        T_matrix[:,-1,:] = edge2



        #T(0)
        T_matrix[:,:,0] = 25
        T_matrix[0,:,0] = 25
        T_matrix[-1,:,0] = 25
        T_matrix[:,0,0] = edge1
        T_matrix[:,-1,0] = edge2



        for time in range(1,1+int(t/delta_t)):
        for x in range(1,1+int(X/delta_X)):
        for y in range(1,1+int(Y/delta_Y)):

        T_matrix[x,y,time] = T_matrix[x,y,time-1] + alpha*delta_t*(((T_matrix[x+1,y,time-1]-T_matrix[x,y,time-1])/delta_X) + ((T_matrix[x,y+1,time-1]-T_matrix[x,y,time-1])/delta_Y)) + beta*delta_t*((T_matrix[x+1,y,time-1] - 2*T_matrix[x,y,time-1] + T_matrix[x-1,y,time-1])/(delta_X**2)+(T_matrix[x,y+1,time-1] - 2*T_matrix[x,y,time-1] + T_matrix[x,y-1,time-1])/(delta_Y)**2)

        return T_matrix

        area_tmp = [175,175,175,175,175,195,235,255,255,25,25]


        bound = np.zeros(4355)

        bound[0:250] = 25

        bound[250:250+305] = area_tmp[0]
        bound[250+305+50:250+305+50+305] = area_tmp[1]
        bound[250+305+50+305+50:250+305+50+305+50+305] = area_tmp[2]
        bound[250+305+50+305+50+305+50:250+305+50+305+50+305+50+305] = area_tmp[3]
        bound[250+305+50+305+50+305+50+305+50:250+305+50+305+50+305+50+305+50+305] = area_tmp[4]
        bound[250+305+50+305+50+305+50+305+50+305+50:250+305+50+305+50+305+50+305+50+305+50+305] = area_tmp[5]
        bound[250+305+50+305+50+305+50+305+50+305+50+305+50:250+305+50+305+50+305+50+305+50+305+50+305+50+305] = area_tmp[6]
        bound[250+305+50+305+50+305+50+305+50+305+50+305+50+305+50:250+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305] = area_tmp[7]
        bound[250+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50:250+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305] = area_tmp[8]
        bound[250+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50:250+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305] = area_tmp[9]
        bound[250+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50:250+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305+50+305] = area_tmp[10]

        bound[-250::] = 25

        for i in range(10):

        tmp = bound_constract(area_tmp[i],area_tmp[i+1])[:,:,-1]
        bound[250+(305+50)*i+305:250+(305+50)*i+305+50] = (tmp[25,1:-1]+tmp[26,1:-1])/2


        plt.plot(bound)
        plt.show()

        np.savetxt('bound.txt',bound)
        np.savetxt('tmp.txt',tmp)

        #Problem_1

        import numpy as np
        import pandas as pd
        import numba as nb
        from sko.GA import GA
        import math
        import matplotlib.pyplot as plt

        data = pd.read_excel('data.xlsx')
        data = np.array(data)

        a = np.loadtxt('bound.txt')
        b = np.loadtxt('tmp.txt')

        def pcb_1(epo):

        delta_t = 373/4355
        delta_X = 1

        T_matrix = np.zeros((17,4355))

        #Bound
        T_matrix[0,:] = a
        T_matrix[-1,:] = a


        #T(0)
        T_matrix[:,0] = 25

        for time in range(1,4355):
        for x in range(1,16):

        T_matrix[x,time] = T_matrix[x,time-1] +  epo*delta_t*((T_matrix[x+1,time-1] - 2*T_matrix[x,time-1] + T_matrix[x-1,time-1])/(delta_X**2))

        global tmp

        tmp = T_matrix[8,:]

        goal = 0

        for i in data:
        index = math.floor((i[0]/(373/4355))) -1

        goal += (i[1]-tmp[index])**2

        print(goal/709)

        return goal/709

        de = GA(func=pcb_1, n_dim=1, size_pop=10, max_iter=10, lb=[0], ub=[1])
        temp = de.run()
        print(temp)
        pcb_1(temp[0])

        plt.plot(data[:,0]/(373/4355),data[:,1])
        plt.plot(tmp)
        plt.show()
