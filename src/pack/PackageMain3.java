package pack;

import pack.a.User; // 이름이 같은 경우 한개만 import가능

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
    }
}
