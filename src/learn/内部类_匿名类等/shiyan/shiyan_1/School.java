package learn.内部类_匿名类等.shiyan.shiyan_1;

public class School {
    String schoolName;
    InnerNewspaper newspaper;
    School() {
        // this("某某大学");
    }
    School(String s) {
        newspaper = new InnerNewspaper();
        String[] content = {"fdsf","ffg","gsgr"};
        schoolName = s;
        newspaper.setContent(content);
    }
    public void showNews() {
        newspaper.showContent();
    }
    class InnerNewspaper {
        String[] content;
        String paperName = "校园新闻周报";
        void setContent(String[] s) {
            content = s;
        }
        public void showContent() {
            System.out.println(schoolName);
            for (int i=0; i<content.length; i++) {
                System.out.println(content[i]);
            }
        }
    }
}
