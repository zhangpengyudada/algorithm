public class ReplaceSpace {
    //替换数组中的空格
    public StringBuffer replaceSpace(String s){
        int n=s.length();
        char[] array=new char[n*3];

        int size=0;
        for (int i=0;i<n;i++){
            char c=s.charAt(i);
            if (c==' '){
                array[size++]='%';
                array[size++]='2';
                array[size++]='0';

            }else {
                array[size++]=c;
            }
        }
        StringBuffer news =new StringBuffer();
        news.append(array);
        System.out.println(news);
        return news;




    }
    public static void main(String[] args) {
        ReplaceSpace replaceSpace=new ReplaceSpace();
        replaceSpace.replaceSpace(" we are family ");
    }
}
