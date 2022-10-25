#Merge two sorted array
def merge(a,b):
     lena=len(a);
     lenb=len(b);
     print(lena,lenb)
     i=0;
     j=0;
     c=list();
     while(i<lena and j<lenb):
         if a[i]<=b[j]:
             c.append(a[i]);
             i+=1;
         elif(a[i]>=b[j]):
             c.append(b[j]);
             j+=1;
     while(i<lena):
         c.append(a[i])
         i+=1;
     while(j<lenb):
         c.append(b[j])
         j+=1;
     return c
merge([22,34],[43,98])                    
