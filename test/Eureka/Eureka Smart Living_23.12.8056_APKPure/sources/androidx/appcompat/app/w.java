package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.k1;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.z1;
import androidx.appcompat.widget.z2;
import androidx.core.view.b1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class w {

    /* renamed from: b, reason: collision with root package name */
    private static final Class[] f420b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f421c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f422d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f423e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f424f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f425g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h, reason: collision with root package name */
    private static final l.g f426h = new l.g();

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f427a = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f428a;

        /* renamed from: b, reason: collision with root package name */
        private final String f429b;

        /* renamed from: c, reason: collision with root package name */
        private Method f430c;

        /* renamed from: d, reason: collision with root package name */
        private Context f431d;

        public a(View view, String str) {
            this.f428a = view;
            this.f429b = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f429b, View.class)) != null) {
                        this.f430c = method;
                        this.f431d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f428a.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f428a.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f429b + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f428a.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f430c == null) {
                a(this.f428a.getContext());
            }
            try {
                this.f430c.invoke(this.f431d, view);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException("Could not execute method for android:onClick", e7);
            }
        }
    }

    private void a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f422d);
        if (obtainStyledAttributes.hasValue(0)) {
            b1.r0(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f423e);
        if (obtainStyledAttributes2.hasValue(0)) {
            b1.t0(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f424f);
        if (obtainStyledAttributes3.hasValue(0)) {
            b1.F0(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && b1.P(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f421c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) {
        String str3;
        l.g gVar = f426h;
        Constructor constructor = (Constructor) gVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f420b);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f427a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f427a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return s(context, str, null);
            }
            int i6 = 0;
            while (true) {
                String[] strArr = f425g;
                if (i6 >= strArr.length) {
                    return null;
                }
                View s5 = s(context, str, strArr[i6]);
                if (s5 != null) {
                    return s5;
                }
                i6++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f427a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z5, boolean z6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f6359v3, 0, 0);
        int resourceId = z5 ? obtainStyledAttributes.getResourceId(d.j.f6364w3, 0) : 0;
        if (z6 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(d.j.f6369x3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof androidx.appcompat.view.d) && ((androidx.appcompat.view.d) context).c() == resourceId) ? context : new androidx.appcompat.view.d(context, resourceId) : context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.d c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.d(context, attributeSet);
    }

    protected androidx.appcompat.widget.f d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.g e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.g(context, attributeSet);
    }

    protected androidx.appcompat.widget.h f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.h(context, attributeSet);
    }

    protected androidx.appcompat.widget.l g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.l(context, attributeSet);
    }

    protected androidx.appcompat.widget.p h(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.p(context, attributeSet);
    }

    protected androidx.appcompat.widget.r i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    protected androidx.appcompat.widget.s j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet);
    }

    protected n0 k(Context context, AttributeSet attributeSet) {
        return new n0(context, attributeSet);
    }

    protected o0 l(Context context, AttributeSet attributeSet) {
        return new o0(context, attributeSet);
    }

    protected r0 m(Context context, AttributeSet attributeSet) {
        return new r0(context, attributeSet);
    }

    protected t0 n(Context context, AttributeSet attributeSet) {
        return new t0(context, attributeSet);
    }

    protected k1 o(Context context, AttributeSet attributeSet) {
        return new k1(context, attributeSet);
    }

    protected z1 p(Context context, AttributeSet attributeSet) {
        return new z1(context, attributeSet);
    }

    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View r(View view, String str, Context context, AttributeSet attributeSet, boolean z5, boolean z6, boolean z7, boolean z8) {
        View l6;
        Context context2 = (!z5 || view == null) ? context : view.getContext();
        if (z6 || z7) {
            context2 = u(context2, attributeSet, z6, z7);
        }
        if (z8) {
            context2 = z2.b(context2);
        }
        str.hashCode();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c6 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c6 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c6 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c6 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c6 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c6 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c6 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c6 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c6 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c6 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c6 = '\r';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                l6 = l(context2, attributeSet);
                v(l6, str);
                break;
            case 1:
                l6 = f(context2, attributeSet);
                v(l6, str);
                break;
            case 2:
                l6 = j(context2, attributeSet);
                v(l6, str);
                break;
            case 3:
                l6 = o(context2, attributeSet);
                v(l6, str);
                break;
            case 4:
                l6 = h(context2, attributeSet);
                v(l6, str);
                break;
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                l6 = m(context2, attributeSet);
                v(l6, str);
                break;
            case 6:
                l6 = n(context2, attributeSet);
                v(l6, str);
                break;
            case 7:
                l6 = k(context2, attributeSet);
                v(l6, str);
                break;
            case '\b':
                l6 = p(context2, attributeSet);
                v(l6, str);
                break;
            case '\t':
                l6 = i(context2, attributeSet);
                v(l6, str);
                break;
            case '\n':
                l6 = c(context2, attributeSet);
                v(l6, str);
                break;
            case 11:
                l6 = e(context2, attributeSet);
                v(l6, str);
                break;
            case '\f':
                l6 = g(context2, attributeSet);
                v(l6, str);
                break;
            case '\r':
                l6 = d(context2, attributeSet);
                v(l6, str);
                break;
            default:
                l6 = q(context2, str, attributeSet);
                break;
        }
        if (l6 == null && context != context2) {
            l6 = t(context2, str, attributeSet);
        }
        if (l6 != null) {
            b(l6, attributeSet);
            a(context2, l6, attributeSet);
        }
        return l6;
    }
}
