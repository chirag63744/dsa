// class Solution
// {
// static class Meeting {
// int start;
// int end;
// int pos;
// Meeting(int start,int end,int pos)
// {
// this.start=start;
// this.end=end;
// this.pos=pos;
// }
// }

// //Function to find the maximum number of meetings that can
// //be performed in a meeting room.
// public static int maxMeetings(int start[], int end[], int n)
// {
// List<Meeting>data=new ArrayList<>();
// for(int i=0;i<end.length;i++)
// {
// data.add(new Meeting(start[i],end[i],i+1));
// }
// for(int i=0;i<end.length;i++)
// {
// Collections.sort(data,new Comparator<Meeting>(){
// public int compare(Meeting a, Meeting b)
// {
// if(a.end<b.end)
// {
// return -1;
// }
// else if(a.end>b.end){
// return 1;
// }
// else if(a.pos<b.pos)
// {
// return -1;
// }
// else{
// return 1;
// }
// }
// });
// }
// int last=data.get(0).end;
// int count=1;
// for(int i =1;i<end.length;i++)
// {
// if(data.get(i).start>last)
// {
// last=data.get(i).end;
// count++;
// }
// }
// return count;

// // add your code here
// }
// }
