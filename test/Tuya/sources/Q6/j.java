package Q6;

import L5.I;
import L5.x;
import M5.AbstractC1246t;
import P6.AbstractC1283i;
import P6.AbstractC1285k;
import P6.C1284j;
import P6.InterfaceC1281g;
import P6.L;
import P6.Q;
import P6.b0;
import X5.n;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import g6.AbstractC2725a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;

/* loaded from: classes5.dex */
public abstract class j {

    /* loaded from: classes5.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a(((i) obj).a(), ((i) obj2).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f8363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f8364b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f8365c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1281g f8366d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S f8367e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f8368f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O o8, long j8, S s8, InterfaceC1281g interfaceC1281g, S s9, S s10) {
            super(2);
            this.f8363a = o8;
            this.f8364b = j8;
            this.f8365c = s8;
            this.f8366d = interfaceC1281g;
            this.f8367e = s9;
            this.f8368f = s10;
        }

        public final void a(int i8, long j8) {
            long j9;
            if (i8 == 1) {
                O o8 = this.f8363a;
                if (!o8.f33757a) {
                    o8.f33757a = true;
                    if (j8 >= this.f8364b) {
                        S s8 = this.f8365c;
                        long j10 = s8.f33760a;
                        if (j10 == 4294967295L) {
                            j10 = this.f8366d.readLongLe();
                        }
                        s8.f33760a = j10;
                        S s9 = this.f8367e;
                        long j11 = 0;
                        if (s9.f33760a == 4294967295L) {
                            j9 = this.f8366d.readLongLe();
                        } else {
                            j9 = 0;
                        }
                        s9.f33760a = j9;
                        S s10 = this.f8368f;
                        if (s10.f33760a == 4294967295L) {
                            j11 = this.f8366d.readLongLe();
                        }
                        s10.f33760a = j11;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1281g f8369a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f8370b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f8371c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f8372d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1281g interfaceC1281g, T t8, T t9, T t10) {
            super(2);
            this.f8369a = interfaceC1281g;
            this.f8370b = t8;
            this.f8371c = t9;
            this.f8372d = t10;
        }

        public final void a(int i8, long j8) {
            boolean z8;
            boolean z9;
            if (i8 == 21589) {
                long j9 = 1;
                if (j8 >= 1) {
                    byte readByte = this.f8369a.readByte();
                    boolean z10 = false;
                    if ((readByte & 1) == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if ((readByte & 2) == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if ((readByte & 4) == 4) {
                        z10 = true;
                    }
                    InterfaceC1281g interfaceC1281g = this.f8369a;
                    if (z8) {
                        j9 = 5;
                    }
                    if (z9) {
                        j9 += 4;
                    }
                    if (z10) {
                        j9 += 4;
                    }
                    if (j8 >= j9) {
                        if (z8) {
                            this.f8370b.f33761a = Long.valueOf(interfaceC1281g.readIntLe() * 1000);
                        }
                        if (z9) {
                            this.f8371c.f33761a = Long.valueOf(this.f8369a.readIntLe() * 1000);
                        }
                        if (z10) {
                            this.f8372d.f33761a = Long.valueOf(this.f8369a.readIntLe() * 1000);
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return I.f6487a;
        }
    }

    private static final Map a(List list) {
        Q e8 = Q.a.e(Q.f8001b, "/", false, 1, null);
        Map m8 = M5.Q.m(x.a(e8, new i(e8, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null)));
        for (i iVar : AbstractC1246t.P0(list, new a())) {
            if (((i) m8.put(iVar.a(), iVar)) == null) {
                while (true) {
                    Q i8 = iVar.a().i();
                    if (i8 != null) {
                        i iVar2 = (i) m8.get(i8);
                        if (iVar2 != null) {
                            iVar2.b().add(iVar.a());
                            break;
                        }
                        i iVar3 = new i(i8, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null);
                        m8.put(i8, iVar3);
                        iVar3.b().add(iVar.a());
                        iVar = iVar3;
                    }
                }
            }
        }
        return m8;
    }

    private static final Long b(int i8, int i9) {
        if (i9 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i8 >> 9) & 127) + 1980, ((i8 >> 5) & 15) - 1, i8 & 31, (i9 >> 11) & 31, (i9 >> 5) & 63, (i9 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    private static final String c(int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String num = Integer.toString(i8, AbstractC2725a.a(16));
        AbstractC3159y.h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static final b0 d(Q zipPath, AbstractC1285k fileSystem, Function1 predicate) {
        InterfaceC1281g d8;
        AbstractC3159y.i(zipPath, "zipPath");
        AbstractC3159y.i(fileSystem, "fileSystem");
        AbstractC3159y.i(predicate, "predicate");
        AbstractC1283i i8 = fileSystem.i(zipPath);
        try {
            long A8 = i8.A() - 22;
            if (A8 >= 0) {
                long max = Math.max(A8 - 65536, 0L);
                do {
                    InterfaceC1281g d9 = L.d(i8.E(A8));
                    try {
                        if (d9.readIntLe() == 101010256) {
                            f f8 = f(d9);
                            String readUtf8 = d9.readUtf8(f8.b());
                            d9.close();
                            long j8 = A8 - 20;
                            if (j8 > 0) {
                                InterfaceC1281g d10 = L.d(i8.E(j8));
                                try {
                                    if (d10.readIntLe() == 117853008) {
                                        int readIntLe = d10.readIntLe();
                                        long readLongLe = d10.readLongLe();
                                        if (d10.readIntLe() == 1 && readIntLe == 0) {
                                            d8 = L.d(i8.E(readLongLe));
                                            try {
                                                int readIntLe2 = d8.readIntLe();
                                                if (readIntLe2 == 101075792) {
                                                    f8 = j(d8, f8);
                                                    I i9 = I.f6487a;
                                                    V5.b.a(d8, null);
                                                } else {
                                                    throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(readIntLe2));
                                                }
                                            } finally {
                                            }
                                        } else {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                    }
                                    I i10 = I.f6487a;
                                    V5.b.a(d10, null);
                                } finally {
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            d8 = L.d(i8.E(f8.a()));
                            try {
                                long c8 = f8.c();
                                for (long j9 = 0; j9 < c8; j9++) {
                                    i e8 = e(d8);
                                    if (e8.f() < f8.a()) {
                                        if (((Boolean) predicate.invoke(e8)).booleanValue()) {
                                            arrayList.add(e8);
                                        }
                                    } else {
                                        throw new IOException("bad zip: local file header offset >= central directory offset");
                                    }
                                }
                                I i11 = I.f6487a;
                                V5.b.a(d8, null);
                                b0 b0Var = new b0(zipPath, fileSystem, a(arrayList), readUtf8);
                                V5.b.a(i8, null);
                                return b0Var;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } finally {
                                    V5.b.a(d8, th);
                                }
                            }
                        }
                        d9.close();
                        A8--;
                    } finally {
                        d9.close();
                    }
                } while (A8 >= max);
                throw new IOException("not a zip: end of central directory signature not found");
            }
            throw new IOException("not a zip: size=" + i8.A());
        } finally {
        }
    }

    public static final i e(InterfaceC1281g interfaceC1281g) {
        long j8;
        long j9;
        AbstractC3159y.i(interfaceC1281g, "<this>");
        int readIntLe = interfaceC1281g.readIntLe();
        if (readIntLe == 33639248) {
            interfaceC1281g.skip(4L);
            short readShortLe = interfaceC1281g.readShortLe();
            int i8 = readShortLe & 65535;
            if ((readShortLe & 1) == 0) {
                int readShortLe2 = interfaceC1281g.readShortLe() & 65535;
                Long b8 = b(interfaceC1281g.readShortLe() & 65535, interfaceC1281g.readShortLe() & 65535);
                long readIntLe2 = interfaceC1281g.readIntLe() & 4294967295L;
                S s8 = new S();
                s8.f33760a = interfaceC1281g.readIntLe() & 4294967295L;
                S s9 = new S();
                s9.f33760a = interfaceC1281g.readIntLe() & 4294967295L;
                int readShortLe3 = interfaceC1281g.readShortLe() & 65535;
                int readShortLe4 = interfaceC1281g.readShortLe() & 65535;
                int readShortLe5 = interfaceC1281g.readShortLe() & 65535;
                interfaceC1281g.skip(8L);
                S s10 = new S();
                s10.f33760a = interfaceC1281g.readIntLe() & 4294967295L;
                String readUtf8 = interfaceC1281g.readUtf8(readShortLe3);
                if (!g6.n.G(readUtf8, (char) 0, false, 2, null)) {
                    if (s9.f33760a == 4294967295L) {
                        j8 = 8;
                    } else {
                        j8 = 0;
                    }
                    if (s8.f33760a == 4294967295L) {
                        j9 = j8 + 8;
                    } else {
                        j9 = j8;
                    }
                    if (s10.f33760a == 4294967295L) {
                        j9 += 8;
                    }
                    long j10 = j9;
                    O o8 = new O();
                    g(interfaceC1281g, readShortLe4, new b(o8, j10, s9, interfaceC1281g, s8, s10));
                    if (j10 > 0 && !o8.f33757a) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    return new i(Q.a.e(Q.f8001b, "/", false, 1, null).l(readUtf8), g6.n.r(readUtf8, "/", false, 2, null), interfaceC1281g.readUtf8(readShortLe5), readIntLe2, s8.f33760a, s9.f33760a, readShortLe2, b8, s10.f33760a);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i8));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(readIntLe));
    }

    private static final f f(InterfaceC1281g interfaceC1281g) {
        int readShortLe = interfaceC1281g.readShortLe() & 65535;
        int readShortLe2 = interfaceC1281g.readShortLe() & 65535;
        long readShortLe3 = interfaceC1281g.readShortLe() & 65535;
        if (readShortLe3 == (interfaceC1281g.readShortLe() & 65535) && readShortLe == 0 && readShortLe2 == 0) {
            interfaceC1281g.skip(4L);
            return new f(readShortLe3, 4294967295L & interfaceC1281g.readIntLe(), interfaceC1281g.readShortLe() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    private static final void g(InterfaceC1281g interfaceC1281g, int i8, n nVar) {
        long j8 = i8;
        while (j8 != 0) {
            if (j8 >= 4) {
                int readShortLe = interfaceC1281g.readShortLe() & 65535;
                long readShortLe2 = interfaceC1281g.readShortLe() & 65535;
                long j9 = j8 - 4;
                if (j9 >= readShortLe2) {
                    interfaceC1281g.require(readShortLe2);
                    long x8 = interfaceC1281g.i().x();
                    nVar.invoke(Integer.valueOf(readShortLe), Long.valueOf(readShortLe2));
                    long x9 = (interfaceC1281g.i().x() + readShortLe2) - x8;
                    if (x9 >= 0) {
                        if (x9 > 0) {
                            interfaceC1281g.i().skip(x9);
                        }
                        j8 = j9 - readShortLe2;
                    } else {
                        throw new IOException("unsupported zip: too many bytes processed for " + readShortLe);
                    }
                } else {
                    throw new IOException("bad zip: truncated value in extra field");
                }
            } else {
                throw new IOException("bad zip: truncated header in extra field");
            }
        }
    }

    public static final C1284j h(InterfaceC1281g interfaceC1281g, C1284j basicMetadata) {
        AbstractC3159y.i(interfaceC1281g, "<this>");
        AbstractC3159y.i(basicMetadata, "basicMetadata");
        C1284j i8 = i(interfaceC1281g, basicMetadata);
        AbstractC3159y.f(i8);
        return i8;
    }

    private static final C1284j i(InterfaceC1281g interfaceC1281g, C1284j c1284j) {
        Long l8;
        T t8 = new T();
        if (c1284j != null) {
            l8 = c1284j.a();
        } else {
            l8 = null;
        }
        t8.f33761a = l8;
        T t9 = new T();
        T t10 = new T();
        int readIntLe = interfaceC1281g.readIntLe();
        if (readIntLe == 67324752) {
            interfaceC1281g.skip(2L);
            short readShortLe = interfaceC1281g.readShortLe();
            int i8 = readShortLe & 65535;
            if ((readShortLe & 1) == 0) {
                interfaceC1281g.skip(18L);
                int readShortLe2 = interfaceC1281g.readShortLe() & 65535;
                interfaceC1281g.skip(interfaceC1281g.readShortLe() & 65535);
                if (c1284j == null) {
                    interfaceC1281g.skip(readShortLe2);
                    return null;
                }
                g(interfaceC1281g, readShortLe2, new c(interfaceC1281g, t8, t9, t10));
                return new C1284j(c1284j.d(), c1284j.c(), null, c1284j.b(), (Long) t10.f33761a, (Long) t8.f33761a, (Long) t9.f33761a, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i8));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(readIntLe));
    }

    private static final f j(InterfaceC1281g interfaceC1281g, f fVar) {
        interfaceC1281g.skip(12L);
        int readIntLe = interfaceC1281g.readIntLe();
        int readIntLe2 = interfaceC1281g.readIntLe();
        long readLongLe = interfaceC1281g.readLongLe();
        if (readLongLe == interfaceC1281g.readLongLe() && readIntLe == 0 && readIntLe2 == 0) {
            interfaceC1281g.skip(8L);
            return new f(readLongLe, interfaceC1281g.readLongLe(), fVar.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void k(InterfaceC1281g interfaceC1281g) {
        AbstractC3159y.i(interfaceC1281g, "<this>");
        i(interfaceC1281g, null);
    }
}
