package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import t3.b0;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    String f1574a;

    /* renamed from: b, reason: collision with root package name */
    private b f1575b;

    /* renamed from: c, reason: collision with root package name */
    private int f1576c;

    /* renamed from: d, reason: collision with root package name */
    private float f1577d;

    /* renamed from: e, reason: collision with root package name */
    private String f1578e;

    /* renamed from: f, reason: collision with root package name */
    boolean f1579f;

    /* renamed from: g, reason: collision with root package name */
    private int f1580g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0021a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1581a;

        static {
            int[] iArr = new int[b.values().length];
            f1581a = iArr;
            try {
                iArr[b.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1581a[b.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1581a[b.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1581a[b.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1581a[b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1581a[b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1581a[b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public a(a aVar, Object obj) {
        this.f1574a = aVar.f1574a;
        this.f1575b = aVar.f1575b;
        d(obj);
    }

    public static HashMap a(HashMap hashMap, View view) {
        HashMap hashMap2 = new HashMap();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new a(aVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                e6.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void b(Context context, XmlPullParser xmlPullParser, HashMap hashMap) {
        b bVar;
        Object string;
        int integer;
        float f6;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), h.O2);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar2 = null;
        for (int i6 = 0; i6 < indexCount; i6++) {
            int index = obtainStyledAttributes.getIndex(i6);
            if (index == h.P2) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == h.Q2) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar2 = b.BOOLEAN_TYPE;
            } else {
                if (index == h.S2) {
                    bVar = b.COLOR_TYPE;
                } else if (index == h.R2) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == h.W2) {
                        bVar = b.DIMENSION_TYPE;
                        f6 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == h.T2) {
                        bVar = b.DIMENSION_TYPE;
                        f6 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == h.U2) {
                        bVar = b.FLOAT_TYPE;
                        f6 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == h.V2) {
                        bVar = b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        bVar2 = bVar;
                        obj = obj2;
                    } else if (index == h.X2) {
                        bVar = b.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        bVar2 = bVar;
                        obj = obj22;
                    }
                    string = Float.valueOf(f6);
                    Object obj222 = string;
                    bVar2 = bVar;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                bVar2 = bVar;
                obj = obj2222;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new a(str, bVar2, obj));
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0041. Please report as an issue. */
    public static void c(View view, HashMap hashMap) {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            a aVar = (a) hashMap.get(str);
            String str2 = "set" + str;
            try {
                switch (C0021a.f1581a[aVar.f1575b.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1580g));
                        break;
                    case 2:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1580g);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(aVar.f1576c));
                        break;
                    case 4:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f1577d));
                        break;
                    case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                        cls.getMethod(str2, CharSequence.class).invoke(view, aVar.f1578e);
                        break;
                    case 6:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(aVar.f1579f));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(aVar.f1577d));
                        break;
                }
            } catch (IllegalAccessException e6) {
                e = e6;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e7) {
                Log.e("TransitionLayout", e7.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e8) {
                e = e8;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    public void d(Object obj) {
        switch (C0021a.f1581a[this.f1575b.ordinal()]) {
            case 1:
            case 2:
                this.f1580g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f1576c = ((Integer) obj).intValue();
                return;
            case 4:
            case 7:
                this.f1577d = ((Float) obj).floatValue();
                return;
            case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                this.f1578e = (String) obj;
                return;
            case 6:
                this.f1579f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }

    public a(String str, b bVar, Object obj) {
        this.f1574a = str;
        this.f1575b = bVar;
        d(obj);
    }
}
