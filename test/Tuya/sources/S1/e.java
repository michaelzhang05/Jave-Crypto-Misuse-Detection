package S1;

import Y1.D;
import Y1.s;
import Y1.u;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: j, reason: collision with root package name */
    private static String f8952j = D.g(d.class);

    /* renamed from: a, reason: collision with root package name */
    final Class f8953a;

    /* renamed from: b, reason: collision with root package name */
    final b[] f8954b;

    /* renamed from: c, reason: collision with root package name */
    final i f8955c;

    /* renamed from: d, reason: collision with root package name */
    final String f8956d;

    /* renamed from: e, reason: collision with root package name */
    final String f8957e;

    /* renamed from: f, reason: collision with root package name */
    final String f8958f;

    /* renamed from: g, reason: collision with root package name */
    final String f8959g;

    /* renamed from: h, reason: collision with root package name */
    final HashMap f8960h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    Class f8961i = NoSuchFieldException.class;

    public e(Class cls, b[] bVarArr, i iVar) {
        this.f8953a = cls;
        this.f8954b = bVarArr;
        this.f8955c = iVar;
        String name = cls.getName();
        this.f8956d = name;
        if (name.startsWith("java.")) {
            this.f8957e = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            this.f8957e = name.concat("AccAccess");
        }
        this.f8958f = this.f8957e.replace('.', '/');
        this.f8959g = name.replace('.', '/');
    }

    private void d(u uVar, int i8, int i9, s sVar) {
        uVar.E(21, i8);
        if (i9 == 0) {
            uVar.n(154, sVar);
            return;
        }
        if (i9 == 1) {
            uVar.j(4);
            uVar.n(160, sVar);
            return;
        }
        if (i9 == 2) {
            uVar.j(5);
            uVar.n(160, sVar);
            return;
        }
        if (i9 == 3) {
            uVar.j(6);
            uVar.n(160, sVar);
            return;
        }
        if (i9 == 4) {
            uVar.j(7);
            uVar.n(160, sVar);
        } else if (i9 == 5) {
            uVar.j(8);
            uVar.n(160, sVar);
        } else {
            if (i9 >= 6) {
                uVar.l(16, i9);
                uVar.n(160, sVar);
                return;
            }
            throw new RuntimeException("non supported negative values");
        }
    }

    private void e(u uVar, b bVar) {
        Method method;
        uVar.E(25, 1);
        uVar.D(PsExtractor.AUDIO_STREAM, this.f8959g);
        uVar.E(25, 3);
        D m8 = D.m(bVar.b());
        Class b8 = bVar.b();
        String g8 = D.g(b8);
        Method method2 = (Method) this.f8960h.get(b8);
        if (method2 != null) {
            uVar.v(184, D.g(method2.getDeclaringClass()), method2.getName(), D.h(method2), false);
        } else if (bVar.c()) {
            s sVar = new s();
            uVar.n(198, sVar);
            uVar.E(25, 3);
            uVar.v(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            uVar.v(184, g8, "valueOf", "(Ljava/lang/String;)L" + g8 + ";", false);
            uVar.E(58, 3);
            uVar.o(sVar);
            uVar.h(3, 0, null, 0, null);
            uVar.E(25, 1);
            uVar.D(PsExtractor.AUDIO_STREAM, this.f8959g);
            uVar.E(25, 3);
            uVar.D(PsExtractor.AUDIO_STREAM, g8);
        } else if (b8.equals(String.class)) {
            s sVar2 = new s();
            uVar.n(198, sVar2);
            uVar.E(25, 3);
            uVar.v(182, "java/lang/Object", "toString", "()Ljava/lang/String;", false);
            uVar.E(58, 3);
            uVar.o(sVar2);
            uVar.h(3, 0, null, 0, null);
            uVar.E(25, 1);
            uVar.D(PsExtractor.AUDIO_STREAM, this.f8959g);
            uVar.E(25, 3);
            uVar.D(PsExtractor.AUDIO_STREAM, g8);
        } else {
            uVar.D(PsExtractor.AUDIO_STREAM, g8);
        }
        if (!bVar.d() && (method = bVar.f8945b) != null) {
            uVar.v(182, this.f8959g, bVar.f8945b.getName(), D.h(method), false);
        } else {
            uVar.g(181, this.f8959g, bVar.a(), m8.d());
        }
        uVar.j(177);
    }

    private void f(u uVar, Class cls) {
        String g8 = D.g(cls);
        uVar.D(187, g8);
        uVar.j(89);
        uVar.p("mapping " + this.f8956d + " failed to map field:");
        uVar.E(21, 2);
        uVar.v(184, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
        uVar.v(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        uVar.v(183, g8, "<init>", "(Ljava/lang/String;)V", false);
        uVar.j(191);
    }

    private void g(u uVar, Class cls) {
        String g8 = D.g(cls);
        uVar.D(187, g8);
        uVar.j(89);
        uVar.p("mapping " + this.f8956d + " failed to map field:");
        uVar.E(25, 2);
        uVar.v(182, "java/lang/String", "concat", "(Ljava/lang/String;)Ljava/lang/String;", false);
        uVar.v(183, g8, "<init>", "(Ljava/lang/String;)V", false);
        uVar.j(191);
    }

    public void a(Class cls) {
        if (cls == null) {
            return;
        }
        for (Method method : cls.getMethods()) {
            if ((method.getModifiers() & 8) != 0) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(Object.class)) {
                    Class<?> returnType = method.getReturnType();
                    if (!returnType.equals(Void.TYPE)) {
                        this.f8960h.put(returnType, method);
                    }
                }
            }
        }
    }

    public void b(Iterable iterable) {
        if (iterable == null) {
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            a((Class) it.next());
        }
    }

    public Class c() {
        boolean z8;
        Method method;
        Method method2;
        int i8;
        Method method3;
        Y1.h hVar = new Y1.h(1);
        if (this.f8954b.length > 10) {
            z8 = true;
        } else {
            z8 = false;
        }
        hVar.a(50, 33, this.f8958f, "Lnet/minidev/asm/BeansAccess<L" + this.f8959g + ";>;", f8952j, null);
        u g8 = hVar.g(1, "<init>", "()V", null, null);
        g8.e();
        int i9 = 25;
        g8.E(25, 0);
        g8.v(183, f8952j, "<init>", "()V", false);
        g8.j(177);
        g8.u(1, 1);
        g8.f();
        u g9 = hVar.g(1, "set", "(Ljava/lang/Object;ILjava/lang/Object;)V", null, null);
        g9.e();
        b[] bVarArr = this.f8954b;
        if (bVarArr.length != 0) {
            if (bVarArr.length > 14) {
                g9.E(21, 2);
                s[] f8 = a.f(this.f8954b.length);
                s sVar = new s();
                g9.z(0, f8.length - 1, sVar, f8);
                b[] bVarArr2 = this.f8954b;
                int length = bVarArr2.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    b bVar = bVarArr2[i10];
                    int i12 = i11 + 1;
                    g9.o(f8[i11]);
                    if (!bVar.g()) {
                        g9.j(177);
                    } else {
                        e(g9, bVar);
                    }
                    i10++;
                    i11 = i12;
                }
                g9.o(sVar);
            } else {
                s[] f9 = a.f(bVarArr.length);
                int i13 = 0;
                for (b bVar2 : this.f8954b) {
                    d(g9, 2, i13, f9[i13]);
                    e(g9, bVar2);
                    g9.o(f9[i13]);
                    g9.h(3, 0, null, 0, null);
                    i13++;
                }
            }
        }
        Class cls = this.f8961i;
        if (cls != null) {
            f(g9, cls);
        } else {
            g9.j(177);
        }
        g9.u(0, 0);
        g9.f();
        u g10 = hVar.g(1, "get", "(Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
        g10.e();
        b[] bVarArr3 = this.f8954b;
        int length2 = bVarArr3.length;
        int i14 = PsExtractor.AUDIO_STREAM;
        if (length2 == 0) {
            g10.h(3, 0, null, 0, null);
        } else if (bVarArr3.length > 14) {
            g10.E(21, 2);
            s[] f10 = a.f(this.f8954b.length);
            s sVar2 = new s();
            g10.z(0, f10.length - 1, sVar2, f10);
            b[] bVarArr4 = this.f8954b;
            int length3 = bVarArr4.length;
            int i15 = 0;
            int i16 = 0;
            while (i15 < length3) {
                b bVar3 = bVarArr4[i15];
                int i17 = i16 + 1;
                g10.o(f10[i16]);
                g10.h(3, 0, null, 0, null);
                if (!bVar3.e()) {
                    g10.j(1);
                    g10.j(176);
                } else {
                    g10.E(i9, 1);
                    g10.D(i14, this.f8959g);
                    D m8 = D.m(bVar3.b());
                    if (!bVar3.d() && (method2 = bVar3.f8946c) != null) {
                        g10.v(182, this.f8959g, bVar3.f8946c.getName(), D.h(method2), false);
                    } else {
                        g10.g(SubsamplingScaleImageView.ORIENTATION_180, this.f8959g, bVar3.a(), m8.d());
                    }
                    a.a(g10, m8);
                    g10.j(176);
                }
                i15++;
                i16 = i17;
                i14 = PsExtractor.AUDIO_STREAM;
                i9 = 25;
            }
            g10.o(sVar2);
            g10.h(3, 0, null, 0, null);
        } else {
            s[] f11 = a.f(bVarArr3.length);
            int i18 = 0;
            for (b bVar4 : this.f8954b) {
                d(g10, 2, i18, f11[i18]);
                g10.E(25, 1);
                g10.D(PsExtractor.AUDIO_STREAM, this.f8959g);
                D m9 = D.m(bVar4.b());
                if (!bVar4.d() && (method = bVar4.f8946c) != null) {
                    if (method != null) {
                        g10.v(182, this.f8959g, bVar4.f8946c.getName(), D.h(method), false);
                    } else {
                        throw new RuntimeException("no Getter for field " + bVar4.a() + " in class " + this.f8956d);
                    }
                } else {
                    g10.g(SubsamplingScaleImageView.ORIENTATION_180, this.f8959g, bVar4.a(), m9.d());
                }
                a.a(g10, m9);
                g10.j(176);
                g10.o(f11[i18]);
                g10.h(3, 0, null, 0, null);
                i18++;
            }
        }
        Class cls2 = this.f8961i;
        if (cls2 != null) {
            f(g10, cls2);
        } else {
            g10.j(1);
            g10.j(176);
        }
        g10.u(0, 0);
        g10.f();
        int i19 = 153;
        if (!z8) {
            i8 = PsExtractor.AUDIO_STREAM;
            u g11 = hVar.g(1, "set", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", null, null);
            g11.e();
            s[] f12 = a.f(this.f8954b.length);
            int i20 = 0;
            for (b bVar5 : this.f8954b) {
                g11.E(25, 2);
                g11.p(bVar5.f8949f);
                g11.v(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                g11.n(153, f12[i20]);
                e(g11, bVar5);
                g11.o(f12[i20]);
                g11.h(3, 0, null, 0, null);
                i20++;
            }
            Class cls3 = this.f8961i;
            if (cls3 != null) {
                g(g11, cls3);
            } else {
                g11.j(177);
            }
            g11.u(0, 0);
            g11.f();
        } else {
            i8 = PsExtractor.AUDIO_STREAM;
        }
        if (!z8) {
            u g12 = hVar.g(1, "get", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;", null, null);
            g12.e();
            s[] f13 = a.f(this.f8954b.length);
            b[] bVarArr5 = this.f8954b;
            int length4 = bVarArr5.length;
            int i21 = 0;
            int i22 = 0;
            while (i21 < length4) {
                b bVar6 = bVarArr5[i21];
                g12.E(25, 2);
                g12.p(bVar6.f8949f);
                g12.v(182, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
                g12.n(i19, f13[i22]);
                g12.E(25, 1);
                g12.D(i8, this.f8959g);
                D m10 = D.m(bVar6.b());
                if (!bVar6.d() && (method3 = bVar6.f8946c) != null) {
                    g12.v(182, this.f8959g, bVar6.f8946c.getName(), D.h(method3), false);
                } else {
                    g12.g(SubsamplingScaleImageView.ORIENTATION_180, this.f8959g, bVar6.a(), m10.d());
                }
                a.a(g12, m10);
                g12.j(176);
                g12.o(f13[i22]);
                g12.h(3, 0, null, 0, null);
                i22++;
                i21++;
                i19 = 153;
            }
            Class cls4 = this.f8961i;
            if (cls4 != null) {
                g(g12, cls4);
            } else {
                g12.j(1);
                g12.j(176);
            }
            g12.u(0, 0);
            g12.f();
        }
        u g13 = hVar.g(1, "newInstance", "()Ljava/lang/Object;", null, null);
        g13.e();
        g13.D(187, this.f8959g);
        g13.j(89);
        g13.v(183, this.f8959g, "<init>", "()V", false);
        g13.j(176);
        g13.u(2, 1);
        g13.f();
        hVar.d();
        return this.f8955c.a(this.f8957e, hVar.t());
    }
}
