class VarArgs {
    public static void main(String[] args) {
        System.out.println(concatenate("Swastik  "));
        System.out.println(concatenate("chandra "));
        System.out.println(concatenate("agrahari "));


    }

    public static String concatenate(String...strs){
    StringBuilder sb  = new StringBuilder();
        for (String str : strs){
        sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
