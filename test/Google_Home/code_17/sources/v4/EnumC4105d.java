package v4;

import P5.AbstractC1378t;
import android.graphics.Bitmap;
import j6.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: v4.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC4105d {

    /* renamed from: c, reason: collision with root package name */
    public static final a f40152c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC4105d f40153d = new EnumC4105d("PNG", 0, AbstractC1378t.e("png"), Bitmap.CompressFormat.PNG);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC4105d f40154e = new EnumC4105d("WEBP", 1, AbstractC1378t.e("webp"), Bitmap.CompressFormat.WEBP);

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC4105d f40155f = new EnumC4105d("JPEG", 2, AbstractC1378t.p("jpeg", "jpg"), Bitmap.CompressFormat.JPEG);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC4105d[] f40156g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ U5.a f40157h;

    /* renamed from: a, reason: collision with root package name */
    private final List f40158a;

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap.CompressFormat f40159b;

    /* renamed from: v4.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final EnumC4105d a(String url) {
            Object obj;
            AbstractC3255y.i(url, "url");
            Iterator<E> it = EnumC4105d.c().iterator();
            loop0: while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    List d8 = ((EnumC4105d) obj).d();
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
            return (EnumC4105d) obj;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        EnumC4105d[] a8 = a();
        f40156g = a8;
        f40157h = U5.b.a(a8);
        f40152c = new a(null);
    }

    private EnumC4105d(String str, int i8, List list, Bitmap.CompressFormat compressFormat) {
        this.f40158a = list;
        this.f40159b = compressFormat;
    }

    private static final /* synthetic */ EnumC4105d[] a() {
        return new EnumC4105d[]{f40153d, f40154e, f40155f};
    }

    public static U5.a c() {
        return f40157h;
    }

    public static EnumC4105d valueOf(String str) {
        return (EnumC4105d) Enum.valueOf(EnumC4105d.class, str);
    }

    public static EnumC4105d[] values() {
        return (EnumC4105d[]) f40156g.clone();
    }

    public final Bitmap.CompressFormat b() {
        return this.f40159b;
    }

    public final List d() {
        return this.f40158a;
    }
}
