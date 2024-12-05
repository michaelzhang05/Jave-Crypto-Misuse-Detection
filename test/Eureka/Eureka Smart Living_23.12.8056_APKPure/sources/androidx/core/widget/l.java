package androidx.core.widget;

import android.widget.ListView;

/* loaded from: classes.dex */
public abstract class l {

    /* loaded from: classes.dex */
    static class a {
        static boolean a(ListView listView, int i6) {
            return listView.canScrollList(i6);
        }

        static void b(ListView listView, int i6) {
            listView.scrollListBy(i6);
        }
    }

    public static void a(ListView listView, int i6) {
        a.b(listView, i6);
    }
}
