package com.facebook.t.x;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import cm.aptoide.pt.root.execution.Command;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SuggestedEventViewHierarchy.java */
/* loaded from: classes.dex */
class c {
    private static final List<Class<? extends View>> a = new ArrayList(Arrays.asList(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class));

    c() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<View> a(View view) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<Class<? extends View>> it = a.iterator();
            while (it.hasNext()) {
                if (it.next().isInstance(view)) {
                    return arrayList;
                }
            }
            if (view.isClickable()) {
                arrayList.add(view);
            }
            Iterator<View> it2 = com.facebook.t.r.g.f.b(view).iterator();
            while (it2.hasNext()) {
                arrayList.addAll(a(it2.next()));
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject b(View view, View view2) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            List<View> b2 = com.facebook.t.r.g.f.b(view);
            for (int i2 = 0; i2 < b2.size(); i2++) {
                jSONArray.put(b(b2.get(i2), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    private static List<String> c(View view) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : com.facebook.t.r.g.f.b(view)) {
                String k2 = com.facebook.t.r.g.f.k(view2);
                if (!k2.isEmpty()) {
                    arrayList.add(k2);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String d(View view) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            String k2 = com.facebook.t.r.g.f.k(view);
            return !k2.isEmpty() ? k2 : TextUtils.join(" ", c(view));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    static void e(View view, JSONObject jSONObject) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            String k2 = com.facebook.t.r.g.f.k(view);
            String i2 = com.facebook.t.r.g.f.i(view);
            jSONObject.put("classname", view.getClass().getSimpleName());
            jSONObject.put("classtypebitmask", com.facebook.t.r.g.f.c(view));
            if (!k2.isEmpty()) {
                jSONObject.put(Command.CommandHandler.TEXT, k2);
            }
            if (!i2.isEmpty()) {
                jSONObject.put("hint", i2);
            }
            if (view instanceof EditText) {
                jSONObject.put("inputtype", ((EditText) view).getInputType());
            }
        } catch (JSONException unused) {
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }
}
