package s4;

import M5.AbstractC1246t;
import android.graphics.Bitmap;
import g6.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: s4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC3752d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f37879c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC3752d f37880d = new EnumC3752d("PNG", 0, AbstractC1246t.e("png"), Bitmap.CompressFormat.PNG);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC3752d f37881e = new EnumC3752d("WEBP", 1, AbstractC1246t.e("webp"), Bitmap.CompressFormat.WEBP);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC3752d f37882f = new EnumC3752d("JPEG", 2, AbstractC1246t.p("jpeg", "jpg"), Bitmap.CompressFormat.JPEG);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC3752d[] f37883g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ R5.a f37884h;

    /* renamed from: a, reason: collision with root package name */
    private final List f37885a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap.CompressFormat f37886b;

    /* renamed from: s4.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final EnumC3752d a(String url) {
            Object obj;
            AbstractC3159y.i(url, "url");
            Iterator<E> it = EnumC3752d.c().iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    List d8 = ((EnumC3752d) obj).d();
                    if (!(d8 instanceof Collection) || !d8.isEmpty()) {
                        Iterator it2 = d8.iterator();
                        while (it2.hasNext()) {
                            if (n.q(url, (String) it2.next(), true)) {
                                break loop0;
                            }
                        }
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (EnumC3752d) obj;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        EnumC3752d[] a8 = a();
        f37883g = a8;
        f37884h = R5.b.a(a8);
        f37879c = new a(null);
    }

    private EnumC3752d(String str, int i8, List list, Bitmap.CompressFormat compressFormat) {
        this.f37885a = list;
        this.f37886b = compressFormat;
    }

    private static final /* synthetic */ EnumC3752d[] a() {
        return new EnumC3752d[]{f37880d, f37881e, f37882f};
    }

    public static R5.a c() {
        return f37884h;
    }

    public static EnumC3752d valueOf(String str) {
        return (EnumC3752d) Enum.valueOf(EnumC3752d.class, str);
    }

    public static EnumC3752d[] values() {
        return (EnumC3752d[]) f37883g.clone();
    }

    public final Bitmap.CompressFormat b() {
        return this.f37886b;
    }

    public final List d() {
        return this.f37885a;
    }
}
