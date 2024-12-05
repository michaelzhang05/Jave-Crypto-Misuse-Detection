package com.facebook.t.q;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.t.r.g.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MetadataMatcher.java */
/* loaded from: classes.dex */
final class b {
    b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> a(View view) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup j2 = f.j(view);
            if (j2 != null) {
                for (View view2 : f.b(j2)) {
                    if (view != view2) {
                        arrayList.addAll(c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<String> b(View view) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(f.i(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String[] split = view.getResources().getResourceName(view.getId()).split("/");
                    if (split.length == 2) {
                        arrayList.add(split[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!str.isEmpty() && str.length() <= 100) {
                    arrayList2.add(str.toLowerCase());
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    static List<String> c(View view) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!charSequence.isEmpty() && charSequence.length() < 100) {
                    arrayList.add(charSequence.toLowerCase());
                }
                return arrayList;
            }
            Iterator<View> it = f.b(view).iterator();
            while (it.hasNext()) {
                arrayList.addAll(c(it.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return null;
        }
    }

    static boolean d(String str, List<String> list) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(List<String> list, List<String> list2) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (d(it.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(b.class)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, b.class);
            return false;
        }
    }
}
