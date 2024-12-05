package kotlin.reflect.x.internal.l0.c.b;

import java.io.Serializable;
import kotlin.jvm.internal.g;

/* compiled from: LookupLocation.kt */
/* loaded from: classes2.dex */
public final class e implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final a f19822f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    private static final e f19823g = new e(-1, -1);

    /* renamed from: h, reason: collision with root package name */
    private final int f19824h;

    /* renamed from: i, reason: collision with root package name */
    private final int f19825i;

    /* compiled from: LookupLocation.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final e a() {
            return e.f19823g;
        }
    }

    public e(int i2, int i3) {
        this.f19824h = i2;
        this.f19825i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f19824h == eVar.f19824h && this.f19825i == eVar.f19825i;
    }

    public int hashCode() {
        return (this.f19824h * 31) + this.f19825i;
    }

    public String toString() {
        return "Position(line=" + this.f19824h + ", column=" + this.f19825i + ')';
    }
}
