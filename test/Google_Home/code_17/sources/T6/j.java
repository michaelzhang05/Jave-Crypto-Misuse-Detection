package T6;

import O5.I;
import O5.x;
import P5.AbstractC1378t;
import S6.AbstractC1421i;
import S6.AbstractC1423k;
import S6.C1422j;
import S6.InterfaceC1419g;
import S6.L;
import S6.Q;
import S6.b0;
import a6.InterfaceC1668n;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import j6.AbstractC3202a;
import j6.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.S;
import kotlin.jvm.internal.T;

/* loaded from: classes5.dex */
public abstract class j {

    /* loaded from: classes5.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a(((i) obj).a(), ((i) obj2).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f10160a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f10161b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f10162c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1419g f10163d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ S f10164e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f10165f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(O o8, long j8, S s8, InterfaceC1419g interfaceC1419g, S s9, S s10) {
            super(2);
            this.f10160a = o8;
            this.f10161b = j8;
            this.f10162c = s8;
            this.f10163d = interfaceC1419g;
            this.f10164e = s9;
            this.f10165f = s10;
        }

        public final void a(int i8, long j8) {
            long j9;
            if (i8 == 1) {
                O o8 = this.f10160a;
                if (!o8.f34158a) {
                    o8.f34158a = true;
                    if (j8 >= this.f10161b) {
                        S s8 = this.f10162c;
                        long j10 = s8.f34161a;
                        if (j10 == 4294967295L) {
                            j10 = this.f10163d.readLongLe();
                        }
                        s8.f34161a = j10;
                        S s9 = this.f10164e;
                        long j11 = 0;
                        if (s9.f34161a == 4294967295L) {
                            j9 = this.f10163d.readLongLe();
                        } else {
                            j9 = 0;
                        }
                        s9.f34161a = j9;
                        S s10 = this.f10165f;
                        if (s10.f34161a == 4294967295L) {
                            j11 = this.f10163d.readLongLe();
                        }
                        s10.f34161a = j11;
                        return;
                    }
                    throw new IOException("bad zip: zip64 extra too short");
                }
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1419g f10166a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f10167b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f10168c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ T f10169d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1419g interfaceC1419g, T t8, T t9, T t10) {
            super(2);
            this.f10166a = interfaceC1419g;
            this.f10167b = t8;
            this.f10168c = t9;
            this.f10169d = t10;
        }

        public final void a(int i8, long j8) {
            boolean z8;
            boolean z9;
            if (i8 == 21589) {
                long j9 = 1;
                if (j8 >= 1) {
                    byte readByte = this.f10166a.readByte();
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
                    InterfaceC1419g interfaceC1419g = this.f10166a;
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
                            this.f10167b.f34162a = Long.valueOf(interfaceC1419g.readIntLe() * 1000);
                        }
                        if (z9) {
                            this.f10168c.f34162a = Long.valueOf(this.f10166a.readIntLe() * 1000);
                        }
                        if (z10) {
                            this.f10169d.f34162a = Long.valueOf(this.f10166a.readIntLe() * 1000);
                            return;
                        }
                        return;
                    }
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                throw new IOException("bad zip: extended timestamp extra too short");
            }
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(((Number) obj).intValue(), ((Number) obj2).longValue());
            return I.f8278a;
        }
    }

    private static final Map a(List list) {
        Q e8 = Q.a.e(Q.f9832b, "/", false, 1, null);
        Map m8 = P5.Q.m(x.a(e8, new i(e8, true, null, 0L, 0L, 0L, 0, null, 0L, TypedValues.PositionType.TYPE_CURVE_FIT, null)));
        for (i iVar : AbstractC1378t.P0(list, new a())) {
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
        String num = Integer.toString(i8, AbstractC3202a.a(16));
        AbstractC3255y.h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    /* JADX WARN: Finally extract failed */
    public static final b0 d(Q zipPath, AbstractC1423k fileSystem, Function1 predicate) {
        InterfaceC1419g d8;
        AbstractC3255y.i(zipPath, "zipPath");
        AbstractC3255y.i(fileSystem, "fileSystem");
        AbstractC3255y.i(predicate, "predicate");
        AbstractC1421i i8 = fileSystem.i(zipPath);
        try {
            long D8 = i8.D() - 22;
            if (D8 >= 0) {
                long max = Math.max(D8 - 65536, 0L);
                do {
                    InterfaceC1419g d9 = L.d(i8.E(D8));
                    try {
                        if (d9.readIntLe() == 101010256) {
                            f f8 = f(d9);
                            String readUtf8 = d9.readUtf8(f8.b());
                            d9.close();
                            long j8 = D8 - 20;
                            if (j8 > 0) {
                                InterfaceC1419g d10 = L.d(i8.E(j8));
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
                                                    I i9 = I.f8278a;
                                                    Y5.b.a(d8, null);
                                                } else {
                                                    throw new IOException("bad zip: expected " + c(101075792) + " but was " + c(readIntLe2));
                                                }
                                            } finally {
                                            }
                                        } else {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                    }
                                    I i10 = I.f8278a;
                                    Y5.b.a(d10, null);
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
                                I i11 = I.f8278a;
                                Y5.b.a(d8, null);
                                b0 b0Var = new b0(zipPath, fileSystem, a(arrayList), readUtf8);
                                Y5.b.a(i8, null);
                                return b0Var;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } finally {
                                    Y5.b.a(d8, th);
                                }
                            }
                        }
                        d9.close();
                        D8--;
                    } finally {
                        d9.close();
                    }
                } while (D8 >= max);
                throw new IOException("not a zip: end of central directory signature not found");
            }
            throw new IOException("not a zip: size=" + i8.D());
        } finally {
        }
    }

    public static final i e(InterfaceC1419g interfaceC1419g) {
        long j8;
        long j9;
        AbstractC3255y.i(interfaceC1419g, "<this>");
        int readIntLe = interfaceC1419g.readIntLe();
        if (readIntLe == 33639248) {
            interfaceC1419g.skip(4L);
            short readShortLe = interfaceC1419g.readShortLe();
            int i8 = readShortLe & 65535;
            if ((readShortLe & 1) == 0) {
                int readShortLe2 = interfaceC1419g.readShortLe() & 65535;
                Long b8 = b(interfaceC1419g.readShortLe() & 65535, interfaceC1419g.readShortLe() & 65535);
                long readIntLe2 = interfaceC1419g.readIntLe() & 4294967295L;
                S s8 = new S();
                s8.f34161a = interfaceC1419g.readIntLe() & 4294967295L;
                S s9 = new S();
                s9.f34161a = interfaceC1419g.readIntLe() & 4294967295L;
                int readShortLe3 = interfaceC1419g.readShortLe() & 65535;
                int readShortLe4 = interfaceC1419g.readShortLe() & 65535;
                int readShortLe5 = interfaceC1419g.readShortLe() & 65535;
                interfaceC1419g.skip(8L);
                S s10 = new S();
                s10.f34161a = interfaceC1419g.readIntLe() & 4294967295L;
                String readUtf8 = interfaceC1419g.readUtf8(readShortLe3);
                if (!n.G(readUtf8, (char) 0, false, 2, null)) {
                    if (s9.f34161a == 4294967295L) {
                        j8 = 8;
                    } else {
                        j8 = 0;
                    }
                    if (s8.f34161a == 4294967295L) {
                        j9 = j8 + 8;
                    } else {
                        j9 = j8;
                    }
                    if (s10.f34161a == 4294967295L) {
                        j9 += 8;
                    }
                    long j10 = j9;
                    O o8 = new O();
                    g(interfaceC1419g, readShortLe4, new b(o8, j10, s9, interfaceC1419g, s8, s10));
                    if (j10 > 0 && !o8.f34158a) {
                        throw new IOException("bad zip: zip64 extra required but absent");
                    }
                    return new i(Q.a.e(Q.f9832b, "/", false, 1, null).l(readUtf8), n.r(readUtf8, "/", false, 2, null), interfaceC1419g.readUtf8(readShortLe5), readIntLe2, s8.f34161a, s9.f34161a, readShortLe2, b8, s10.f34161a);
                }
                throw new IOException("bad zip: filename contains 0x00");
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i8));
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(readIntLe));
    }

    private static final f f(InterfaceC1419g interfaceC1419g) {
        int readShortLe = interfaceC1419g.readShortLe() & 65535;
        int readShortLe2 = interfaceC1419g.readShortLe() & 65535;
        long readShortLe3 = interfaceC1419g.readShortLe() & 65535;
        if (readShortLe3 == (interfaceC1419g.readShortLe() & 65535) && readShortLe == 0 && readShortLe2 == 0) {
            interfaceC1419g.skip(4L);
            return new f(readShortLe3, 4294967295L & interfaceC1419g.readIntLe(), interfaceC1419g.readShortLe() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    private static final void g(InterfaceC1419g interfaceC1419g, int i8, InterfaceC1668n interfaceC1668n) {
        long j8 = i8;
        while (j8 != 0) {
            if (j8 >= 4) {
                int readShortLe = interfaceC1419g.readShortLe() & 65535;
                long readShortLe2 = interfaceC1419g.readShortLe() & 65535;
                long j9 = j8 - 4;
                if (j9 >= readShortLe2) {
                    interfaceC1419g.require(readShortLe2);
                    long E8 = interfaceC1419g.i().E();
                    interfaceC1668n.invoke(Integer.valueOf(readShortLe), Long.valueOf(readShortLe2));
                    long E9 = (interfaceC1419g.i().E() + readShortLe2) - E8;
                    if (E9 >= 0) {
                        if (E9 > 0) {
                            interfaceC1419g.i().skip(E9);
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

    public static final C1422j h(InterfaceC1419g interfaceC1419g, C1422j basicMetadata) {
        AbstractC3255y.i(interfaceC1419g, "<this>");
        AbstractC3255y.i(basicMetadata, "basicMetadata");
        C1422j i8 = i(interfaceC1419g, basicMetadata);
        AbstractC3255y.f(i8);
        return i8;
    }

    private static final C1422j i(InterfaceC1419g interfaceC1419g, C1422j c1422j) {
        Long l8;
        T t8 = new T();
        if (c1422j != null) {
            l8 = c1422j.a();
        } else {
            l8 = null;
        }
        t8.f34162a = l8;
        T t9 = new T();
        T t10 = new T();
        int readIntLe = interfaceC1419g.readIntLe();
        if (readIntLe == 67324752) {
            interfaceC1419g.skip(2L);
            short readShortLe = interfaceC1419g.readShortLe();
            int i8 = readShortLe & 65535;
            if ((readShortLe & 1) == 0) {
                interfaceC1419g.skip(18L);
                int readShortLe2 = interfaceC1419g.readShortLe() & 65535;
                interfaceC1419g.skip(interfaceC1419g.readShortLe() & 65535);
                if (c1422j == null) {
                    interfaceC1419g.skip(readShortLe2);
                    return null;
                }
                g(interfaceC1419g, readShortLe2, new c(interfaceC1419g, t8, t9, t10));
                return new C1422j(c1422j.d(), c1422j.c(), null, c1422j.b(), (Long) t10.f34162a, (Long) t8.f34162a, (Long) t9.f34162a, null, 128, null);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i8));
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(readIntLe));
    }

    private static final f j(InterfaceC1419g interfaceC1419g, f fVar) {
        interfaceC1419g.skip(12L);
        int readIntLe = interfaceC1419g.readIntLe();
        int readIntLe2 = interfaceC1419g.readIntLe();
        long readLongLe = interfaceC1419g.readLongLe();
        if (readLongLe == interfaceC1419g.readLongLe() && readIntLe == 0 && readIntLe2 == 0) {
            interfaceC1419g.skip(8L);
            return new f(readLongLe, interfaceC1419g.readLongLe(), fVar.b());
        }
        throw new IOException("unsupported zip: spanned");
    }

    public static final void k(InterfaceC1419g interfaceC1419g) {
        AbstractC3255y.i(interfaceC1419g, "<this>");
        i(interfaceC1419g, null);
    }
}
