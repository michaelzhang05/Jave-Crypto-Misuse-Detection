package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {
    int a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f1284b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f1285c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f1286d = -1;

    public int a() {
        return this.f1284b;
    }

    public int b() {
        int i2 = this.f1285c;
        int c2 = c();
        if (c2 == 6) {
            i2 |= 4;
        } else if (c2 == 7) {
            i2 |= 1;
        }
        return i2 & 273;
    }

    public int c() {
        int i2 = this.f1286d;
        return i2 != -1 ? i2 : AudioAttributesCompat.a(false, this.f1285c, this.a);
    }

    public int d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f1284b == audioAttributesImplBase.a() && this.f1285c == audioAttributesImplBase.b() && this.a == audioAttributesImplBase.d() && this.f1286d == audioAttributesImplBase.f1286d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1284b), Integer.valueOf(this.f1285c), Integer.valueOf(this.a), Integer.valueOf(this.f1286d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1286d != -1) {
            sb.append(" stream=");
            sb.append(this.f1286d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.a));
        sb.append(" content=");
        sb.append(this.f1284b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1285c).toUpperCase());
        return sb.toString();
    }
}
