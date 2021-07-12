package com.gff.zy;

public class Phone {
        //2.在对象本身new 自己，而且是一个static修饰的
        private  static Phone ourInstance = new Phone();
        //写出返回自身对象方法的返回值
//@Contract(pure = true)



        public static Phone getInstance() {
            return ourInstance;
        }
        //无参构造方法私有化
        private Phone(){


        }
}

