package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final AssetManager f3147a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3148b;

    /* renamed from: c, reason: collision with root package name */
    private final i.c f3149c;

    /* renamed from: e, reason: collision with root package name */
    private final File f3151e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3152f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3153g;

    /* renamed from: h, reason: collision with root package name */
    private final String f3154h;

    /* renamed from: j, reason: collision with root package name */
    private d[] f3156j;

    /* renamed from: k, reason: collision with root package name */
    private byte[] f3157k;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3155i = false;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f3150d = d();

    public c(AssetManager assetManager, Executor executor, i.c cVar, String str, String str2, String str3, File file) {
        this.f3147a = assetManager;
        this.f3148b = executor;
        this.f3149c = cVar;
        this.f3152f = str;
        this.f3153g = str2;
        this.f3154h = str3;
        this.f3151e = file;
    }

    private c b(d[] dVarArr, byte[] bArr) {
        i.c cVar;
        int i6;
        InputStream h6;
        try {
            h6 = h(this.f3147a, this.f3154h);
        } catch (FileNotFoundException e6) {
            e = e6;
            cVar = this.f3149c;
            i6 = 9;
            cVar.b(i6, e);
            return null;
        } catch (IOException e7) {
            e = e7;
            cVar = this.f3149c;
            i6 = 7;
            cVar.b(i6, e);
            return null;
        } catch (IllegalStateException e8) {
            e = e8;
            this.f3156j = null;
            cVar = this.f3149c;
            i6 = 8;
            cVar.b(i6, e);
            return null;
        }
        if (h6 == null) {
            if (h6 != null) {
                h6.close();
            }
            return null;
        }
        try {
            this.f3156j = n.q(h6, n.o(h6, n.f3185b), bArr, dVarArr);
            h6.close();
            return this;
        } finally {
        }
    }

    private void c() {
        if (!this.f3155i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 24 || i6 > 33) {
            return null;
        }
        switch (i6) {
            case 24:
            case 25:
                return r.f3200e;
            case 26:
                return r.f3199d;
            case 27:
                return r.f3198c;
            case 28:
            case 29:
            case 30:
                return r.f3197b;
            case 31:
            case 32:
            case 33:
                return r.f3196a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        i.c cVar;
        int i6;
        try {
            return h(assetManager, this.f3153g);
        } catch (FileNotFoundException e6) {
            e = e6;
            cVar = this.f3149c;
            i6 = 6;
            cVar.b(i6, e);
            return null;
        } catch (IOException e7) {
            e = e7;
            cVar = this.f3149c;
            i6 = 7;
            cVar.b(i6, e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i6, Object obj) {
        this.f3149c.b(i6, obj);
    }

    private InputStream h(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f3149c.a(5, null);
            }
            return null;
        }
    }

    private d[] j(InputStream inputStream) {
        try {
        } catch (IOException e6) {
            this.f3149c.b(7, e6);
        }
        try {
            try {
                d[] w5 = n.w(inputStream, n.o(inputStream, n.f3184a), this.f3152f);
                try {
                    inputStream.close();
                    return w5;
                } catch (IOException e7) {
                    this.f3149c.b(7, e7);
                    return w5;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    this.f3149c.b(7, e8);
                }
                throw th;
            }
        } catch (IOException e9) {
            this.f3149c.b(7, e9);
            inputStream.close();
            return null;
        } catch (IllegalStateException e10) {
            this.f3149c.b(8, e10);
            inputStream.close();
            return null;
        }
    }

    private static boolean k() {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 24 || i6 > 33) {
            return false;
        }
        if (i6 != 24 && i6 != 25) {
            switch (i6) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i6, final Object obj) {
        this.f3148b.execute(new Runnable() { // from class: androidx.profileinstaller.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.g(i6, obj);
            }
        });
    }

    public boolean e() {
        if (this.f3150d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f3151e.canWrite()) {
            this.f3155i = true;
            return true;
        }
        l(4, null);
        return false;
    }

    public c i() {
        c b6;
        c();
        if (this.f3150d == null) {
            return this;
        }
        InputStream f6 = f(this.f3147a);
        if (f6 != null) {
            this.f3156j = j(f6);
        }
        d[] dVarArr = this.f3156j;
        return (dVarArr == null || !k() || (b6 = b(dVarArr, this.f3150d)) == null) ? this : b6;
    }

    public c m() {
        i.c cVar;
        int i6;
        ByteArrayOutputStream byteArrayOutputStream;
        d[] dVarArr = this.f3156j;
        byte[] bArr = this.f3150d;
        if (dVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    n.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                cVar = this.f3149c;
                i6 = 7;
                cVar.b(i6, e);
                this.f3156j = null;
                return this;
            } catch (IllegalStateException e7) {
                e = e7;
                cVar = this.f3149c;
                i6 = 8;
                cVar.b(i6, e);
                this.f3156j = null;
                return this;
            }
            if (!n.B(byteArrayOutputStream, bArr, dVarArr)) {
                this.f3149c.b(5, null);
                this.f3156j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f3157k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f3156j = null;
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean n() {
        byte[] bArr = this.f3157k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f3151e);
                    try {
                        e.l(byteArrayInputStream, fileOutputStream);
                        l(1, null);
                        fileOutputStream.close();
                        byteArrayInputStream.close();
                        return true;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.f3157k = null;
                this.f3156j = null;
            }
        } catch (FileNotFoundException e6) {
            l(6, e6);
            return false;
        } catch (IOException e7) {
            l(7, e7);
            return false;
        }
    }
}
