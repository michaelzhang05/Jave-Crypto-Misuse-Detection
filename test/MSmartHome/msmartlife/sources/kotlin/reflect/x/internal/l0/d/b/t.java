package kotlin.reflect.x.internal.l0.d.b;

import cm.aptoide.pt.database.room.RoomInstalled;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.a0.a;
import kotlin.reflect.x.internal.l0.e.a0.b.d;
import kotlin.reflect.x.internal.l0.e.z.c;

/* compiled from: MemberSignature.kt */
/* loaded from: classes2.dex */
public final class t {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final String f20328b;

    /* compiled from: MemberSignature.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final t a(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "desc");
            return new t(str + '#' + str2, null);
        }

        public final t b(d dVar) {
            l.f(dVar, RoomInstalled.SIGNATURE);
            if (dVar instanceof d.b) {
                return d(dVar.c(), dVar.b());
            }
            if (dVar instanceof d.a) {
                return a(dVar.c(), dVar.b());
            }
            throw new NoWhenBranchMatchedException();
        }

        public final t c(c cVar, a.c cVar2) {
            l.f(cVar, "nameResolver");
            l.f(cVar2, RoomInstalled.SIGNATURE);
            return d(cVar.getString(cVar2.z()), cVar.getString(cVar2.y()));
        }

        public final t d(String str, String str2) {
            l.f(str, "name");
            l.f(str2, "desc");
            return new t(str + str2, null);
        }

        public final t e(t tVar, int i2) {
            l.f(tVar, RoomInstalled.SIGNATURE);
            return new t(tVar.a() + '@' + i2, null);
        }
    }

    private t(String str) {
        this.f20328b = str;
    }

    public /* synthetic */ t(String str, g gVar) {
        this(str);
    }

    public final String a() {
        return this.f20328b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && l.a(this.f20328b, ((t) obj).f20328b);
    }

    public int hashCode() {
        return this.f20328b.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f20328b + ')';
    }
}
