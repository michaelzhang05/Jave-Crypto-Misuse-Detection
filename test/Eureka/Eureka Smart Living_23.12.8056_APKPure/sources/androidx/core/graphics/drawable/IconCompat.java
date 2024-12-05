package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.b0;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f2082k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f2083a;

    /* renamed from: b, reason: collision with root package name */
    Object f2084b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f2085c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f2086d;

    /* renamed from: e, reason: collision with root package name */
    public int f2087e;

    /* renamed from: f, reason: collision with root package name */
    public int f2088f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2089g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f2090h;

    /* renamed from: i, reason: collision with root package name */
    public String f2091i;

    /* renamed from: j, reason: collision with root package name */
    public String f2092j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon resource", e6);
                return 0;
            } catch (NoSuchMethodException e7) {
                Log.e("IconCompat", "Unable to get icon resource", e7);
                return 0;
            } catch (InvocationTargetException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            }
        }

        static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon package", e6);
                return null;
            } catch (NoSuchMethodException e7) {
                Log.e("IconCompat", "Unable to get icon package", e7);
                return null;
            } catch (InvocationTargetException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            }
        }

        static int c(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e6) {
                e = e6;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e7) {
                e = e7;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e8) {
                e = e8;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e6) {
                Log.e("IconCompat", "Unable to get icon uri", e6);
                return null;
            } catch (NoSuchMethodException e7) {
                Log.e("IconCompat", "Unable to get icon uri", e7);
                return null;
            } catch (InvocationTargetException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            }
        }

        static Drawable e(Icon icon, Context context) {
            Drawable loadDrawable;
            loadDrawable = icon.loadDrawable(context);
            return loadDrawable;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f2083a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lc3;
                    case 0: goto L8;
                    case 1: goto Laa;
                    case 2: goto L9f;
                    case 3: goto L92;
                    case 4: goto L89;
                    case 5: goto L6f;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.h()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.d.a(r5)
                goto Lb2
            L20:
                if (r5 == 0) goto L54
                java.io.InputStream r5 = r4.i(r5)
                if (r5 == 0) goto L39
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L2f
                goto L77
            L2f:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.a(r5, r1)
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.e.a(r5)
                goto Lb2
            L39:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.h()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L54:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.h()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L6f:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L7c
                java.lang.Object r5 = r4.f2084b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L77:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.b.b(r5)
                goto Lb2
            L7c:
                java.lang.Object r5 = r4.f2084b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.a(r5, r1)
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.e.a(r5)
                goto Lb2
            L89:
                java.lang.Object r5 = r4.f2084b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.h.a(r5)
                goto Lb2
            L92:
                java.lang.Object r5 = r4.f2084b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f2087e
                int r1 = r4.f2088f
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.g.a(r5, r0, r1)
                goto Lb2
            L9f:
                java.lang.String r5 = r4.f()
                int r0 = r4.f2087e
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.f.a(r5, r0)
                goto Lb2
            Laa:
                java.lang.Object r5 = r4.f2084b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.e.a(r5)
            Lb2:
                android.content.res.ColorStateList r0 = r4.f2089g
                if (r0 == 0) goto Lb9
                androidx.core.graphics.drawable.i.a(r5, r0)
            Lb9:
                android.graphics.PorterDuff$Mode r4 = r4.f2090h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f2082k
                if (r4 == r0) goto Lc2
                androidx.core.graphics.drawable.j.a(r5, r4)
            Lc2:
                return r5
            Lc3:
                java.lang.Object r4 = r4.f2084b
                android.graphics.drawable.Icon r4 = androidx.core.app.b0.a(r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            l.a();
            return k.a(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static int a(Object obj) {
            int resId;
            resId = b0.a(obj).getResId();
            return resId;
        }

        static String b(Object obj) {
            String resPackage;
            resPackage = b0.a(obj).getResPackage();
            return resPackage;
        }

        static int c(Object obj) {
            int type;
            type = b0.a(obj).getType();
            return type;
        }

        static Uri d(Object obj) {
            Uri uri;
            uri = b0.a(obj).getUri();
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static Icon a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f2083a = -1;
        this.f2085c = null;
        this.f2086d = null;
        this.f2087e = 0;
        this.f2088f = 0;
        this.f2089g = null;
        this.f2090h = f2082k;
        this.f2091i = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z5) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f6 = min;
        float f7 = 0.5f * f6;
        float f8 = 0.9166667f * f7;
        if (z5) {
            float f9 = 0.010416667f * f6;
            paint.setColor(0);
            paint.setShadowLayer(f9, 0.0f, f6 * 0.020833334f, 1023410176);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.setShadowLayer(f9, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f7, f7, f8, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f7, f7, f8, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Bitmap bitmap) {
        androidx.core.util.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f2084b = bitmap;
        return iconCompat;
    }

    public static IconCompat c(Resources resources, String str, int i6) {
        androidx.core.util.c.c(str);
        if (i6 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2087e = i6;
        if (resources != null) {
            try {
                iconCompat.f2084b = resources.getResourceName(i6);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2084b = str;
        }
        iconCompat.f2092j = str;
        return iconCompat;
    }

    private static String n(int i6) {
        switch (i6) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap d() {
        int i6 = this.f2083a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f2084b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i6 == 1) {
            return (Bitmap) this.f2084b;
        }
        if (i6 == 5) {
            return a((Bitmap) this.f2084b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int e() {
        int i6 = this.f2083a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.a(this.f2084b);
        }
        if (i6 == 2) {
            return this.f2087e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String f() {
        int i6 = this.f2083a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.f2084b);
        }
        if (i6 == 2) {
            String str = this.f2092j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2084b).split(":", -1)[0] : this.f2092j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i6 = this.f2083a;
        return (i6 != -1 || Build.VERSION.SDK_INT < 23) ? i6 : a.c(this.f2084b);
    }

    public Uri h() {
        int i6 = this.f2083a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.d(this.f2084b);
        }
        if (i6 == 4 || i6 == 6) {
            return Uri.parse((String) this.f2084b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        StringBuilder sb;
        String str;
        Uri h6 = h();
        String scheme = h6.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(h6);
            } catch (Exception e6) {
                e = e6;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2084b));
            } catch (FileNotFoundException e7) {
                e = e7;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(h6);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void j() {
        Parcelable parcelable;
        this.f2090h = PorterDuff.Mode.valueOf(this.f2091i);
        switch (this.f2083a) {
            case -1:
                parcelable = this.f2086d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                parcelable = this.f2086d;
                if (parcelable == null) {
                    byte[] bArr = this.f2085c;
                    this.f2084b = bArr;
                    this.f2083a = 3;
                    this.f2087e = 0;
                    this.f2088f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2085c, Charset.forName("UTF-16"));
                this.f2084b = str;
                if (this.f2083a == 2 && this.f2092j == null) {
                    this.f2092j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2084b = this.f2085c;
                return;
        }
        this.f2084b = parcelable;
    }

    public void k(boolean z5) {
        this.f2091i = this.f2090h.name();
        switch (this.f2083a) {
            case -1:
                if (z5) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if (z5) {
                    Bitmap bitmap = (Bitmap) this.f2084b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2085c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2085c = ((String) this.f2084b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2085c = (byte[]) this.f2084b;
                return;
            case 4:
            case 6:
                this.f2085c = this.f2084b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f2086d = (Parcelable) this.f2084b;
    }

    public Icon l() {
        return m(null);
    }

    public Icon m(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        int height;
        if (this.f2083a == -1) {
            return String.valueOf(this.f2084b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(n(this.f2083a));
        switch (this.f2083a) {
            case 1:
            case t3.b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2084b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f2084b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2092j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2087e);
                if (this.f2088f != 0) {
                    sb.append(" off=");
                    height = this.f2088f;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2084b);
                break;
        }
        if (this.f2089g != null) {
            sb.append(" tint=");
            sb.append(this.f2089g);
        }
        if (this.f2090h != f2082k) {
            sb.append(" mode=");
            sb.append(this.f2090h);
        }
        sb.append(")");
        return sb.toString();
    }

    IconCompat(int i6) {
        this.f2085c = null;
        this.f2086d = null;
        this.f2087e = 0;
        this.f2088f = 0;
        this.f2089g = null;
        this.f2090h = f2082k;
        this.f2091i = null;
        this.f2083a = i6;
    }
}
