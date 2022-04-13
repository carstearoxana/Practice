package SocialMediaMediaLike;

public class KataLike {
    public static String likes(String[] name){
        String likeThis=" likes this";
        String and=" and ";
        String s=name[0];

        for(int i=1; i<name.length;i++){
            if(i<name.length-1) {
                s = s+", "+ name[i];
            }else{
                s=s+" and "+name[i];
            }
        }

//        switch (name.length){
//            case 0:
//                System.out.println("no one"+likeThis);
//                break;
//            case 1:
//                System.out.println(name[0]+likeThis);
//                break;
//            case 2:
//                System.out.println(name[0]+and+name[1]+likeThis);
//                break;
//            case 3:
//                System.out.println(name[0]+", "+name[1]+and+name[2]+likeThis);
//                break;
//            default:
//                System.out.println(name[0]+", "+name[1]+and+(name.length-2)+" others"+likeThis);
//        }
        return s;
    }

    @Override
    public String toString() {
        return "KataLike{}";
    }
}
