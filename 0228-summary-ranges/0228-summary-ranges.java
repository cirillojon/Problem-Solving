class Solution{public List<String>summaryRanges(int[] n){List<String>r=new ArrayList<String>();String a="->";int l=n.length;
if(l==0)return r;boolean f=false;int s=0;for(int i=0;i<l-1;i++){if(!f&&n[i+1]==n[i]+1){s=n[i];f=true;}if(f&&n[i+1]==n[i]+1)
continue;if(f&&n[i+1]!=n[i]+1){StringBuilder str=new StringBuilder();f=false;str.append(s);str.append(a);str.append(n[i]);
r.add(str.toString());continue;}r.add(String.valueOf(n[i]));}if(f&&n[l-1]==n[l-2]+1){StringBuilder str=new StringBuilder();
str.append(s);str.append("->");str.append(n[l-1]);r.add(str.toString());}else r.add(String.valueOf(n[l-1]));return r;}}
