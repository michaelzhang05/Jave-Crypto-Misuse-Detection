package kotlin.reflect.x.internal.l0.f;

/* compiled from: Name.java */
/* loaded from: classes2.dex */
public final class f implements Comparable<f> {

    /* renamed from: f, reason: collision with root package name */
    private final String f20722f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f20723g;

    private f(String str, boolean z) {
        if (str == null) {
            d(0);
        }
        this.f20722f = str;
        this.f20723g = z;
    }

    public static boolean B(String str) {
        if (str == null) {
            d(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f C(String str) {
        if (str == null) {
            d(7);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    private static /* synthetic */ void d(int i2) {
        String str = (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) ? 2 : 3];
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i2 == 1) {
            objArr[1] = "asString";
        } else if (i2 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i2 == 3 || i2 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i2) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static f o(String str) {
        if (str == null) {
            d(8);
        }
        if (str.startsWith("<")) {
            return C(str);
        }
        return r(str);
    }

    public static f r(String str) {
        if (str == null) {
            d(5);
        }
        return new f(str, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f20723g == fVar.f20723g && this.f20722f.equals(fVar.f20722f);
    }

    public String f() {
        String str = this.f20722f;
        if (str == null) {
            d(1);
        }
        return str;
    }

    public int hashCode() {
        return (this.f20722f.hashCode() * 31) + (this.f20723g ? 1 : 0);
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        return this.f20722f.compareTo(fVar.f20722f);
    }

    public String n() {
        if (!this.f20723g) {
            String f2 = f();
            if (f2 == null) {
                d(2);
            }
            return f2;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public String toString() {
        return this.f20722f;
    }

    public boolean x() {
        return this.f20723g;
    }
}
