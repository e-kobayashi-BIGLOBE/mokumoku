package mokumoku.modeling.Hayakawork;

import java.util.ArrayList;
import java.util.List;

public class Hayakawork {
    public static void main(String[] args) {
        Hayakawa hayakawa = new Hayakawa();

        hayakawa.appendWork();
        hayakawa.appendWork();
        hayakawa.eatPurin();
        hayakawa.appendWork();
        hayakawa.eatPurin();
        hayakawa.getWork().forEach(v -> System.out.println(v.getValue()));
    }

    public static class Hayakawa {

        private List<Work> work = new ArrayList<>();
        private Saifu saifu = new Saifu(150); // 1日のおやつ代

        public List<Work> getWork() {
            return work;
        }

        public void appendWork() {
            work.add(new Work("雑務"));
        }
        
        public void eatPurin() {
            if (saifu.getMoney() >= 150){
                this.saifu = new Saifu(saifu.getMoney() - 150);
                System.out.println("プリンおいしい！！！");
                appendWork();
            }
        }

        public class Work {
            private final String value;

            private Work(String value) {
                this.value = value;
            }

            public String getValue() {
                return value;
            }
        }

        public class Saifu {
            private final int value;

            private Saifu(int value) {
                this.value = value;
            }

            public int getMoney() {
                return value;
            }
        }
    }
}



