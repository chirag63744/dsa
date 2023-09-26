// class Solution {
// public:
//     int reverse(long int x) {
//        long int z=0;

//         if(x<0)
//         {
//             x=x*-1;
//             string num=to_string(x);
//             int length=num.length();
//             for(int i=length;i>0;i--)
//             {
//                 z+=x%10*pow(10,i-1);
//                 x=x/10;
//             }
//             z=z*-1;
//         }
//         else{
//             string num=to_string(x);
//             int length=num.length();

//             for(int i=length;i>0;i--)
//             {
//                 z+=x%10*pow(10,i-1);
//                 x=x/10;
//             }

//         }
//         if(z>INT_MAX|| z<INT_MIN)
//         {
//             return 0;
//         }
//         else
//         {return z;}

//     }
// };