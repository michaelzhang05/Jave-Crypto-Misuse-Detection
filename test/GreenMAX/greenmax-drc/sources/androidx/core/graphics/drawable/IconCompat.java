package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
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
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public int f927b;

    /* renamed from: c, reason: collision with root package name */
    Object f928c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f929d;

    /* renamed from: e, reason: collision with root package name */
    public Parcelable f930e;

    /* renamed from: f, reason: collision with root package name */
    public int f931f;

    /* renamed from: g, reason: collision with root package name */
    public int f932g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f933h;

    /* renamed from: i, reason: collision with root package name */
    PorterDuff.Mode f934i;

    /* renamed from: j, reason: collision with root package name */
    public String f935j;

    /* renamed from: k, reason: collision with root package name */
    public String f936k;

    public IconCompat() {
        this.f927b = -1;
        this.f929d = null;
        this.f930e = null;
        this.f931f = 0;
        this.f932g = 0;
        this.f933h = null;
        this.f934i = a;
        this.f935j = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f2 = min;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2, (-(bitmap.getHeight() - min)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i2 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f931f = i2;
            if (resources != null) {
                try {
                    iconCompat.f928c = resources.getResourceName(i2);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f928c = str;
            }
            iconCompat.f936k = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    private static int d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static int h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e2);
            return -1;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e3);
            return -1;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon type " + icon, e4);
            return -1;
        }
    }

    private static Uri j(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    private static String p(int i2) {
        switch (i2) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        int i2 = this.f927b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f928c);
        }
        if (i2 == 2) {
            return this.f931f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String e() {
        int i2 = this.f927b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return f((Icon) this.f928c);
        }
        if (i2 == 2) {
            if (TextUtils.isEmpty(this.f936k)) {
                return ((String) this.f928c).split(":", -1)[0];
            }
            return this.f936k;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int g() {
        int i2 = this.f927b;
        return (i2 != -1 || Build.VERSION.SDK_INT < 23) ? i2 : h((Icon) this.f928c);
    }

    public Uri i() {
        int i2 = this.f927b;
        if (i2 == -1 && Build.VERSION.SDK_INT >= 23) {
            return j((Icon) this.f928c);
        }
        if (i2 != 4 && i2 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f928c);
    }

    public InputStream k(Context context) {
        Uri i2 = i();
        String scheme = i2.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f928c));
            } catch (FileNotFoundException e2) {
                Log.w("IconCompat", "Unable to load image from path: " + i2, e2);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(i2);
        } catch (Exception e3) {
            Log.w("IconCompat", "Unable to load image from URI: " + i2, e3);
            return null;
        }
    }

    public void l() {
        this.f934i = PorterDuff.Mode.valueOf(this.f935j);
        switch (this.f927b) {
            case -1:
                Parcelable parcelable = this.f930e;
                if (parcelable != null) {
                    this.f928c = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f930e;
                if (parcelable2 != null) {
                    this.f928c = parcelable2;
                    return;
                }
                byte[] bArr = this.f929d;
                this.f928c = bArr;
                this.f927b = 3;
                this.f931f = 0;
                this.f932g = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f929d, Charset.forName("UTF-16"));
                this.f928c = str;
                if (this.f927b == 2 && this.f936k == null) {
                    this.f936k = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f928c = this.f929d;
                return;
        }
    }

    public void m(boolean z) {
        this.f935j = this.f934i.name();
        switch (this.f927b) {
            case -1:
                if (!z) {
                    this.f930e = (Parcelable) this.f928c;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.f928c;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f929d = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f930e = (Parcelable) this.f928c;
                return;
            case 2:
                this.f929d = ((String) this.f928c).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f929d = (byte[]) this.f928c;
                return;
            case 4:
            case 6:
                this.f929d = this.f928c.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @Deprecated
    public Icon n() {
        return o(null);
    }

    public Icon o(Context context) {
        Icon createWithBitmap;
        switch (this.f927b) {
            case -1:
                return (Icon) this.f928c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) this.f928c);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(e(), this.f931f);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) this.f928c, this.f931f, this.f932g);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) this.f928c);
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) this.f928c);
                    break;
                } else {
                    createWithBitmap = Icon.createWithBitmap(a((Bitmap) this.f928c, false));
                    break;
                }
            case 6:
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(i());
                    break;
                } else if (context != null) {
                    InputStream k2 = k(context);
                    if (k2 == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + i());
                    }
                    if (i2 >= 26) {
                        createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(k2));
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(a(BitmapFactory.decodeStream(k2), false));
                        break;
                    }
                } else {
                    throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + i());
                }
        }
        ColorStateList colorStateList = this.f933h;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f934i;
        if (mode != a) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public String toString() {
        if (this.f927b == -1) {
            return String.valueOf(this.f928c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(p(this.f927b));
        switch (this.f927b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f928c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f928c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f936k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f931f);
                if (this.f932g != 0) {
                    sb.append(" off=");
                    sb.append(this.f932g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f928c);
                break;
        }
        if (this.f933h != null) {
            sb.append(" tint=");
            sb.append(this.f933h);
        }
        if (this.f934i != a) {
            sb.append(" mode=");
            sb.append(this.f934i);
        }
        sb.append(")");
        return sb.toString();
    }

    private IconCompat(int i2) {
        this.f927b = -1;
        this.f929d = null;
        this.f930e = null;
        this.f931f = 0;
        this.f932g = 0;
        this.f933h = null;
        this.f934i = a;
        this.f935j = null;
        this.f927b = i2;
    }
}
