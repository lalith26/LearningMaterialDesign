package weekendlabs.com.materialdesign.model;

/**
 * Created by labr on 29/08/15.
 */
public class NavDrawerItem {

    private  boolean showNotify;

    private String title;

    public NavDrawerItem(boolean showNotify, String title){
        this.showNotify = showNotify;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }
}
