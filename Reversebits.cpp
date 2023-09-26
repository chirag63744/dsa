// long reverseBits(int n)
// {
//     int arr[32];
//     long int sum = 0;
//     int i = 0;
//     int j = 31;
//     while (n != 0)
//     {
//         arr[i] = n % 2;
//         n = n / 2;
//         if (arr[i] != 0)
//         {
//             sum = sum + pow(2, j);
//         }

//         j = j - 1;
//         i = i + 1;
//     }

//     return sum;
// }