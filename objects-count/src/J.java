class J 
{
        static int count;
        J(){
                count++;
        }
        public static void main(String[] args) 
        {
                J obj1 = new J();
                System.out.println("a: " + count);
                J obj2 = new J();
                System.out.println("b: " + count);
                J obj3 = new J();
                System.out.println("c: " + count);
                J obj4 = new J();
                System.out.println("d: " + count);
                System.out.println("e: " + obj1.count);
                System.out.println("f: " + obj2.count);
                System.out.println("g: " + obj3.count);
                System.out.println("h: " + obj4.count);
        }
}

