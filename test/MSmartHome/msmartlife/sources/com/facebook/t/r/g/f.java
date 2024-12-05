package com.facebook.t.r.g;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.root.execution.Command;
import cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment;
import com.facebook.internal.x;
import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewHierarchy.java */
/* loaded from: classes.dex */
public class f {
    private static final String a = "com.facebook.t.r.g.f";

    /* renamed from: b, reason: collision with root package name */
    private static WeakReference<View> f9595b = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    private static Method f9596c = null;

    public static View a(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (!q(view)) {
                    Object parent = view.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    }
                    view = (View) parent;
                } else {
                    return view;
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, f.class);
            }
        }
        return null;
    }

    public static List<View> b(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    arrayList.add(viewGroup.getChildAt(i2));
                }
            }
            return arrayList;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    public static int c(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return 0;
        }
        try {
            int i2 = view instanceof ImageView ? 2 : 0;
            if (view.isClickable()) {
                i2 |= 32;
            }
            if (o(view)) {
                i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            if (view instanceof TextView) {
                int i3 = i2 | 1024 | 1;
                if (view instanceof Button) {
                    i3 |= 4;
                    if (view instanceof Switch) {
                        i3 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i3 |= 32768;
                    }
                }
                return view instanceof EditText ? i3 | RecyclerView.l.FLAG_MOVED : i3;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                return view instanceof RatingBar ? i2 | 65536 : view instanceof RadioGroup ? i2 | Http2.INITIAL_MAX_FRAME_SIZE : ((view instanceof ViewGroup) && p(view, f9595b.get())) ? i2 | 64 : i2;
            }
            return i2 | RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return 0;
        }
    }

    public static JSONObject d(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            if (view.getClass().getName().equals("com.facebook.react.ReactRootView")) {
                f9595b = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                s(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> b2 = b(view);
                for (int i2 = 0; i2 < b2.size(); i2++) {
                    jSONArray.put(d(b2.get(i2)));
                }
                jSONObject.put("childviews", jSONArray);
            } catch (JSONException e2) {
                Log.e(a, "Failed to create JSONObject for view.", e2);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    private static JSONObject e(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("top", view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put("scrollx", view.getScrollX());
                jSONObject.put("scrolly", view.getScrollY());
                jSONObject.put("visibility", view.getVisibility());
            } catch (JSONException e2) {
                Log.e(a, "Failed to create JSONObject for dimension.", e2);
            }
            return jSONObject;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    private static Class<?> f(String str) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    public static View.OnClickListener g(View view) {
        Field declaredField;
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (View.OnClickListener) declaredField.get(obj);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    public static View.OnTouchListener h(View view) {
        Field declaredField;
        try {
            if (com.facebook.internal.a0.f.a.c(f.class)) {
                return null;
            }
            try {
                Field declaredField2 = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                if (declaredField2 != null) {
                    declaredField2.setAccessible(true);
                }
                Object obj = declaredField2.get(view);
                if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                    return null;
                }
                declaredField.setAccessible(true);
                return (View.OnTouchListener) declaredField.get(obj);
            } catch (ClassNotFoundException e2) {
                x.U(a, e2);
                return null;
            } catch (IllegalAccessException e3) {
                x.U(a, e3);
                return null;
            } catch (NoSuchFieldException e4) {
                x.U(a, e4);
                return null;
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    public static String i(View view) {
        CharSequence hint;
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                hint = ((EditText) view).getHint();
            } else {
                hint = view instanceof TextView ? ((TextView) view).getHint() : null;
            }
            return hint == null ? HttpUrl.FRAGMENT_ENCODE_SET : hint.toString();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    public static ViewGroup j(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                return (ViewGroup) parent;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dd A[Catch: all -> 0x00e2, TRY_LEAVE, TryCatch #0 {all -> 0x00e2, blocks: (B:6:0x000a, B:8:0x000e, B:10:0x0019, B:18:0x00dd, B:21:0x0029, B:23:0x002d, B:25:0x0036, B:27:0x003e, B:29:0x0043, B:31:0x004a, B:32:0x0074, B:34:0x0078, B:35:0x009f, B:37:0x00a3, B:39:0x00af, B:41:0x00b9, B:44:0x00bd, B:46:0x00c5, B:49:0x00c8, B:51:0x00cc), top: B:5:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String k(android.view.View r9) {
        /*
            java.lang.Class<com.facebook.t.r.g.f> r0 = com.facebook.t.r.g.f.class
            boolean r1 = com.facebook.internal.a0.f.a.c(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            boolean r1 = r9 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L29
            r1 = r9
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch: java.lang.Throwable -> Le2
            java.lang.CharSequence r1 = r1.getText()     // Catch: java.lang.Throwable -> Le2
            boolean r3 = r9 instanceof android.widget.Switch     // Catch: java.lang.Throwable -> Le2
            if (r3 == 0) goto Ld8
            android.widget.Switch r9 = (android.widget.Switch) r9     // Catch: java.lang.Throwable -> Le2
            boolean r9 = r9.isChecked()     // Catch: java.lang.Throwable -> Le2
            if (r9 == 0) goto L24
            java.lang.String r9 = "1"
            goto L26
        L24:
            java.lang.String r9 = "0"
        L26:
            r1 = r9
            goto Ld8
        L29:
            boolean r1 = r9 instanceof android.widget.Spinner     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L43
            r1 = r9
            android.widget.Spinner r1 = (android.widget.Spinner) r1     // Catch: java.lang.Throwable -> Le2
            int r1 = r1.getCount()     // Catch: java.lang.Throwable -> Le2
            if (r1 <= 0) goto Ld7
            android.widget.Spinner r9 = (android.widget.Spinner) r9     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r9 = r9.getSelectedItem()     // Catch: java.lang.Throwable -> Le2
            if (r9 == 0) goto Ld7
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le2
            goto L26
        L43:
            boolean r1 = r9 instanceof android.widget.DatePicker     // Catch: java.lang.Throwable -> Le2
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L74
            android.widget.DatePicker r9 = (android.widget.DatePicker) r9     // Catch: java.lang.Throwable -> Le2
            int r1 = r9.getYear()     // Catch: java.lang.Throwable -> Le2
            int r6 = r9.getMonth()     // Catch: java.lang.Throwable -> Le2
            int r9 = r9.getDayOfMonth()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r7 = "%04d-%02d-%02d"
            r8 = 3
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le2
            r8[r5] = r1     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Le2
            r8[r4] = r1     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Le2
            r8[r3] = r9     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = java.lang.String.format(r7, r8)     // Catch: java.lang.Throwable -> Le2
            goto Ld8
        L74:
            boolean r1 = r9 instanceof android.widget.TimePicker     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto L9f
            android.widget.TimePicker r9 = (android.widget.TimePicker) r9     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r1 = r9.getCurrentHour()     // Catch: java.lang.Throwable -> Le2
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r9 = r9.getCurrentMinute()     // Catch: java.lang.Throwable -> Le2
            int r9 = r9.intValue()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r6 = "%02d:%02d"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> Le2
            r3[r5] = r1     // Catch: java.lang.Throwable -> Le2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Le2
            r3[r4] = r9     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = java.lang.String.format(r6, r3)     // Catch: java.lang.Throwable -> Le2
            goto Ld8
        L9f:
            boolean r1 = r9 instanceof android.widget.RadioGroup     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Lc8
            android.widget.RadioGroup r9 = (android.widget.RadioGroup) r9     // Catch: java.lang.Throwable -> Le2
            int r1 = r9.getCheckedRadioButtonId()     // Catch: java.lang.Throwable -> Le2
            int r3 = r9.getChildCount()     // Catch: java.lang.Throwable -> Le2
        Lad:
            if (r5 >= r3) goto Ld7
            android.view.View r4 = r9.getChildAt(r5)     // Catch: java.lang.Throwable -> Le2
            int r6 = r4.getId()     // Catch: java.lang.Throwable -> Le2
            if (r6 != r1) goto Lc5
            boolean r6 = r4 instanceof android.widget.RadioButton     // Catch: java.lang.Throwable -> Le2
            if (r6 == 0) goto Lc5
            android.widget.RadioButton r4 = (android.widget.RadioButton) r4     // Catch: java.lang.Throwable -> Le2
            java.lang.CharSequence r9 = r4.getText()     // Catch: java.lang.Throwable -> Le2
            goto L26
        Lc5:
            int r5 = r5 + 1
            goto Lad
        Lc8:
            boolean r1 = r9 instanceof android.widget.RatingBar     // Catch: java.lang.Throwable -> Le2
            if (r1 == 0) goto Ld7
            android.widget.RatingBar r9 = (android.widget.RatingBar) r9     // Catch: java.lang.Throwable -> Le2
            float r9 = r9.getRating()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> Le2
            goto Ld8
        Ld7:
            r1 = r2
        Ld8:
            if (r1 != 0) goto Ldd
            java.lang.String r9 = ""
            goto Le1
        Ldd:
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> Le2
        Le1:
            return r9
        Le2:
            r9 = move-exception
            com.facebook.internal.a0.f.a.b(r9, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.t.r.g.f.k(android.view.View):java.lang.String");
    }

    public static View l(float[] fArr, View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            n();
            Method method = f9596c;
            if (method != null && view != null) {
                try {
                    View view2 = (View) method.invoke(null, fArr, view);
                    if (view2 != null && view2.getId() > 0) {
                        View view3 = (View) view2.getParent();
                        if (view3 != null) {
                            return view3;
                        }
                        return null;
                    }
                } catch (IllegalAccessException e2) {
                    x.U(a, e2);
                } catch (InvocationTargetException e3) {
                    x.U(a, e3);
                }
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    private static float[] m(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return null;
        }
        try {
            view.getLocationOnScreen(new int[2]);
            return new float[]{r3[0], r3[1]};
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return null;
        }
    }

    private static void n() {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return;
        }
        try {
            if (f9596c != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", float[].class, ViewGroup.class);
                f9596c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (ClassNotFoundException e2) {
                x.U(a, e2);
            } catch (NoSuchMethodException e3) {
                x.U(a, e3);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }

    private static boolean o(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            Class<?> f2 = f("android.support.v4.view.NestedScrollingChild");
            if (f2 != null && f2.isInstance(parent)) {
                return true;
            }
            Class<?> f3 = f("androidx.core.view.NestedScrollingChild");
            if (f3 != null) {
                if (f3.isInstance(parent)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return false;
        }
    }

    public static boolean p(View view, View view2) {
        View l;
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return false;
        }
        try {
            if (!view.getClass().getName().equals("com.facebook.react.views.view.ReactViewGroup") || (l = l(m(view), view2)) == null) {
                return false;
            }
            return l.getId() == view.getId();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return false;
        }
    }

    public static boolean q(View view) {
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return false;
        }
        try {
            return view.getClass().getName().equals("com.facebook.react.ReactRootView");
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
            return false;
        }
    }

    public static void r(View view, View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (com.facebook.internal.a0.f.a.c(f.class)) {
            return;
        }
        Object obj = null;
        try {
            try {
                field = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
            } catch (ClassNotFoundException | NoSuchFieldException unused) {
                field = null;
            }
            try {
                field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
            } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                field2 = null;
                if (field == null) {
                }
                view.setOnClickListener(onClickListener);
            }
            if (field == null && field2 != null) {
                field.setAccessible(true);
                field2.setAccessible(true);
                try {
                    field.setAccessible(true);
                    obj = field.get(view);
                } catch (IllegalAccessException unused3) {
                }
                if (obj == null) {
                    view.setOnClickListener(onClickListener);
                    return;
                } else {
                    field2.set(obj, onClickListener);
                    return;
                }
            }
            view.setOnClickListener(onClickListener);
        } catch (Exception unused4) {
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }

    public static void s(View view, JSONObject jSONObject) {
        try {
            if (com.facebook.internal.a0.f.a.c(f.class)) {
                return;
            }
            try {
                String k2 = k(view);
                String i2 = i(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                jSONObject.put("classname", view.getClass().getCanonicalName());
                jSONObject.put("classtypebitmask", c(view));
                jSONObject.put(DeepLinkIntentReceiver.DeepLinksKeys.ID, view.getId());
                if (!d.g(view)) {
                    jSONObject.put(Command.CommandHandler.TEXT, x.i(x.q0(k2), HttpUrl.FRAGMENT_ENCODE_SET));
                } else {
                    jSONObject.put(Command.CommandHandler.TEXT, HttpUrl.FRAGMENT_ENCODE_SET);
                    jSONObject.put("is_user_input", true);
                }
                jSONObject.put("hint", x.i(x.q0(i2), HttpUrl.FRAGMENT_ENCODE_SET));
                if (tag != null) {
                    jSONObject.put(StoreTabGridRecyclerFragment.BundleCons.TAG, x.i(x.q0(tag.toString()), HttpUrl.FRAGMENT_ENCODE_SET));
                }
                if (contentDescription != null) {
                    jSONObject.put("description", x.i(x.q0(contentDescription.toString()), HttpUrl.FRAGMENT_ENCODE_SET));
                }
                jSONObject.put("dimension", e(view));
            } catch (JSONException e2) {
                x.U(a, e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, f.class);
        }
    }
}
