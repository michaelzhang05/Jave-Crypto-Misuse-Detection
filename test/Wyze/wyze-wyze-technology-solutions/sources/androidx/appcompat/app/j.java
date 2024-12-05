package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.v;
import androidx.core.view.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* compiled from: AppCompatViewInflater.java */
/* loaded from: classes.dex */
public class j {
    private static final Class<?>[] a = {Context.class, AttributeSet.class};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f160b = {R.attr.onClick};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f161c = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: d, reason: collision with root package name */
    private static final c.e.g<String, Constructor<? extends View>> f162d = new c.e.g<>();

    /* renamed from: e, reason: collision with root package name */
    private final Object[] f163e = new Object[2];

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AppCompatViewInflater.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: f, reason: collision with root package name */
        private final View f164f;

        /* renamed from: g, reason: collision with root package name */
        private final String f165g;

        /* renamed from: h, reason: collision with root package name */
        private Method f166h;

        /* renamed from: i, reason: collision with root package name */
        private Context f167i;

        public a(View view, String str) {
            this.f164f = view;
            this.f165g = str;
        }

        private void a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f165g, View.class)) != null) {
                        this.f166h = method;
                        this.f167i = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f164f.getId();
            if (id == -1) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str = " with id '" + this.f164f.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f165g + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f164f.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.f166h == null) {
                a(this.f164f.getContext());
            }
            try {
                this.f166h.invoke(this.f167i, view);
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper) {
            if (Build.VERSION.SDK_INT < 15 || u.J(view)) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f160b);
                String string = obtainStyledAttributes.getString(0);
                if (string != null) {
                    view.setOnClickListener(new a(view, string));
                }
                obtainStyledAttributes.recycle();
            }
        }
    }

    private View r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        c.e.g<String, Constructor<? extends View>> gVar = f162d;
        Constructor<? extends View> constructor = gVar.get(str);
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
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(a);
            gVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f163e);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f163e;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 != str.indexOf(46)) {
                return r(context, str, null);
            }
            int i2 = 0;
            while (true) {
                String[] strArr = f161c;
                if (i2 >= strArr.length) {
                    return null;
                }
                View r = r(context, str, strArr[i2]);
                if (r != null) {
                    return r;
                }
                i2++;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f163e;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.a.j.O3, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(c.a.j.P3, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(c.a.j.Q3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? ((context instanceof c.a.o.d) && ((c.a.o.d) context).c() == resourceId) ? context : new c.a.o.d(context, resourceId) : context;
    }

    private void u(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    protected androidx.appcompat.widget.c b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.c(context, attributeSet);
    }

    protected AppCompatButton c(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected androidx.appcompat.widget.e d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.e(context, attributeSet);
    }

    protected androidx.appcompat.widget.f e(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f(context, attributeSet);
    }

    protected androidx.appcompat.widget.i f(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.i(context, attributeSet);
    }

    protected androidx.appcompat.widget.k g(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.k(context, attributeSet);
    }

    protected AppCompatImageView h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    protected androidx.appcompat.widget.m i(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.m(context, attributeSet);
    }

    protected AppCompatRadioButton j(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    protected AppCompatRatingBar k(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    protected p l(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    protected AppCompatSpinner m(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    protected t n(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    protected v o(Context context, AttributeSet attributeSet) {
        return new v(context, attributeSet);
    }

    protected View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View k2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = n0.b(context2);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c2 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                k2 = k(context2, attributeSet);
                u(k2, str);
                break;
            case 1:
                k2 = e(context2, attributeSet);
                u(k2, str);
                break;
            case 2:
                k2 = i(context2, attributeSet);
                u(k2, str);
                break;
            case 3:
                k2 = n(context2, attributeSet);
                u(k2, str);
                break;
            case 4:
                k2 = g(context2, attributeSet);
                u(k2, str);
                break;
            case 5:
                k2 = l(context2, attributeSet);
                u(k2, str);
                break;
            case 6:
                k2 = m(context2, attributeSet);
                u(k2, str);
                break;
            case 7:
                k2 = j(context2, attributeSet);
                u(k2, str);
                break;
            case '\b':
                k2 = o(context2, attributeSet);
                u(k2, str);
                break;
            case '\t':
                k2 = h(context2, attributeSet);
                u(k2, str);
                break;
            case '\n':
                k2 = b(context2, attributeSet);
                u(k2, str);
                break;
            case 11:
                k2 = d(context2, attributeSet);
                u(k2, str);
                break;
            case '\f':
                k2 = f(context2, attributeSet);
                u(k2, str);
                break;
            case '\r':
                k2 = c(context2, attributeSet);
                u(k2, str);
                break;
            default:
                k2 = p(context2, str, attributeSet);
                break;
        }
        if (k2 == null && context != context2) {
            k2 = s(context2, str, attributeSet);
        }
        if (k2 != null) {
            a(k2, attributeSet);
        }
        return k2;
    }
}
