package kotlin.reflect.x.internal.l0.f;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.j;
import kotlin.jvm.functions.Function1;

/* compiled from: FqNameUnsafe.java */
/* loaded from: classes2.dex */
public final class d {
    private static final f a = f.C("<root>");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f20716b = Pattern.compile("\\.");

    /* renamed from: c, reason: collision with root package name */
    private static final Function1<String, f> f20717c = new a();

    /* renamed from: d, reason: collision with root package name */
    private final String f20718d;

    /* renamed from: e, reason: collision with root package name */
    private transient c f20719e;

    /* renamed from: f, reason: collision with root package name */
    private transient d f20720f;

    /* renamed from: g, reason: collision with root package name */
    private transient f f20721g;

    /* compiled from: FqNameUnsafe.java */
    /* loaded from: classes2.dex */
    static class a implements Function1<String, f> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f invoke(String str) {
            return f.o(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f20718d = str;
        this.f20719e = cVar;
    }

    private static /* synthetic */ void a(int i2) {
        String str;
        int i3;
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i3 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        if (i2 != 1) {
            switch (i2) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i2) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private void d() {
        int lastIndexOf = this.f20718d.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f20721g = f.o(this.f20718d.substring(lastIndexOf + 1));
            this.f20720f = new d(this.f20718d.substring(0, lastIndexOf));
        } else {
            this.f20721g = f.o(this.f20718d);
            this.f20720f = c.a.j();
        }
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(16);
        }
        return new d(fVar.f(), c.a.j(), fVar);
    }

    public String b() {
        String str = this.f20718d;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String str;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            str = fVar.f();
        } else {
            str = this.f20718d + "." + fVar.f();
        }
        return new d(str, this, fVar);
    }

    public boolean e() {
        return this.f20718d.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f20718d.equals(((d) obj).f20718d);
    }

    public boolean f() {
        return this.f20719e != null || b().indexOf(60) < 0;
    }

    public d g() {
        d dVar = this.f20720f;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        }
        if (!e()) {
            d();
            d dVar2 = this.f20720f;
            if (dVar2 == null) {
                a(8);
            }
            return dVar2;
        }
        throw new IllegalStateException("root");
    }

    public List<f> h() {
        List<f> emptyList = e() ? Collections.emptyList() : j.K(f20716b.split(this.f20718d), f20717c);
        if (emptyList == null) {
            a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f20718d.hashCode();
    }

    public f i() {
        f fVar = this.f20721g;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        }
        if (!e()) {
            d();
            f fVar2 = this.f20721g;
            if (fVar2 == null) {
                a(11);
            }
            return fVar2;
        }
        throw new IllegalStateException("root");
    }

    public f j() {
        if (e()) {
            f fVar = a;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f i2 = i();
        if (i2 == null) {
            a(13);
        }
        return i2;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int indexOf = this.f20718d.indexOf(46);
        String str = this.f20718d;
        String f2 = fVar.f();
        if (indexOf == -1) {
            indexOf = this.f20718d.length();
        }
        return str.regionMatches(0, f2, 0, indexOf);
    }

    public c l() {
        c cVar = this.f20719e;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f20719e = cVar2;
        if (cVar2 == null) {
            a(6);
        }
        return cVar2;
    }

    public String toString() {
        String f2 = e() ? a.f() : this.f20718d;
        if (f2 == null) {
            a(17);
        }
        return f2;
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f20718d = str;
    }

    private d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f20718d = str;
        this.f20720f = dVar;
        this.f20721g = fVar;
    }
}
