class K 
{
        static int count;
        K(){
                count ++;
        }
        K(int i){
                count ++;
        }
        K(int i, int j){
                count ++;
        }
        public static void main(String[] args) 
        {
                K k1 = new K();
                K k2 = new K(10);
                K k3 = new K(10, 20);
                K k4 = new K(20);
                K k5 = new K();
                System.out.println(count);
        }
}

