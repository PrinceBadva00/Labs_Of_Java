class Q04_PerfectStringCheck {

    static boolean isPerfect(String str) {

        boolean[] visited = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (visited[ch])
                return false;

            visited[ch] = true;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "absdhkqwertyuioplmnvczx";
        System.out.println(isPerfect(str));
    }
}
