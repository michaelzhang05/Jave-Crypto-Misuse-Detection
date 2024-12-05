package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* loaded from: classes2.dex */
final class q00 implements Handler.Callback, zzqk, zzqm, zzrq {
    private int C;
    private int D;
    private long E;
    private int F;
    private s00 G;
    private long H;
    private r00 I;
    private r00 J;
    private r00 K;
    private zzlr L;

    /* renamed from: f, reason: collision with root package name */
    private final zzlo[] f12026f;

    /* renamed from: g, reason: collision with root package name */
    private final zzlp[] f12027g;

    /* renamed from: h, reason: collision with root package name */
    private final zzrp f12028h;

    /* renamed from: i, reason: collision with root package name */
    private final zzll f12029i;

    /* renamed from: j, reason: collision with root package name */
    private final zzsw f12030j;

    /* renamed from: k, reason: collision with root package name */
    private final Handler f12031k;
    private final HandlerThread l;
    private final Handler m;
    private final zzkv n;
    private final zzlu o;
    private final zzlt p;
    private zzle q;
    private zzln r;
    private zzlo s;
    private zzso t;
    private zzql u;
    private zzlo[] v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    private int B = 0;
    private int A = 1;

    public q00(zzlo[] zzloVarArr, zzrp zzrpVar, zzll zzllVar, boolean z, int i2, Handler handler, zzle zzleVar, zzkv zzkvVar) {
        this.f12026f = zzloVarArr;
        this.f12028h = zzrpVar;
        this.f12029i = zzllVar;
        this.x = z;
        this.m = handler;
        this.q = zzleVar;
        this.n = zzkvVar;
        this.f12027g = new zzlp[zzloVarArr.length];
        for (int i3 = 0; i3 < zzloVarArr.length; i3++) {
            zzloVarArr[i3].r(i3);
            this.f12027g[i3] = zzloVarArr[i3].u();
        }
        this.f12030j = new zzsw();
        this.v = new zzlo[0];
        this.o = new zzlu();
        this.p = new zzlt();
        zzrpVar.c(this);
        this.r = zzln.a;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.l = handlerThread;
        handlerThread.start();
        this.f12031k = new Handler(handlerThread.getLooper(), this);
    }

    private final void A() throws zzku {
        this.f12030j.b();
        for (zzlo zzloVar : this.v) {
            l(zzloVar);
        }
    }

    private final void B() {
        J(true);
        this.f12029i.f();
        e(1);
    }

    private final Pair<Integer, Long> C(int i2, long j2) {
        return s(this.L, i2, -9223372036854775807L);
    }

    private final void D(long j2) throws zzku {
        r00 r00Var = this.K;
        long e2 = j2 + (r00Var == null ? 60000000L : r00Var.e());
        this.H = e2;
        this.f12030j.g(e2);
        for (zzlo zzloVar : this.v) {
            zzloVar.A(this.H);
        }
    }

    private final boolean E(long j2) {
        if (j2 == -9223372036854775807L || this.q.f15240c < j2) {
            return true;
        }
        r00 r00Var = this.K.l;
        return r00Var != null && r00Var.f12091j;
    }

    private final void F() throws zzku {
        r00 r00Var = this.K;
        if (r00Var == null) {
            return;
        }
        long e2 = r00Var.a.e();
        if (e2 != -9223372036854775807L) {
            D(e2);
        } else {
            zzlo zzloVar = this.s;
            if (zzloVar != null && !zzloVar.q()) {
                long e3 = this.t.e();
                this.H = e3;
                this.f12030j.g(e3);
            } else {
                this.H = this.f12030j.e();
            }
            e2 = this.H - this.K.e();
        }
        this.q.f15240c = e2;
        this.E = SystemClock.elapsedRealtime() * 1000;
        long q = this.v.length == 0 ? Long.MIN_VALUE : this.K.a.q();
        zzle zzleVar = this.q;
        if (q == Long.MIN_VALUE) {
            q = this.L.c(this.K.f12088g, this.p, false).f15260d;
        }
        zzleVar.f15241d = q;
    }

    private final void G() throws IOException {
        r00 r00Var = this.I;
        if (r00Var == null || r00Var.f12091j) {
            return;
        }
        r00 r00Var2 = this.J;
        if (r00Var2 == null || r00Var2.l == r00Var) {
            for (zzlo zzloVar : this.v) {
                if (!zzloVar.E()) {
                    return;
                }
            }
            this.I.a.f();
        }
    }

    private final void H() {
        r00 r00Var = this.I;
        long a = !r00Var.f12091j ? 0L : r00Var.a.a();
        if (a == Long.MIN_VALUE) {
            I(false);
            return;
        }
        long e2 = this.H - this.I.e();
        boolean d2 = this.f12029i.d(a - e2);
        I(d2);
        if (d2) {
            this.I.a.b(e2);
        }
    }

    private final void I(boolean z) {
        if (this.z != z) {
            this.z = z;
            this.m.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void J(boolean z) {
        this.f12031k.removeMessages(2);
        this.y = false;
        this.f12030j.b();
        this.t = null;
        this.s = null;
        this.H = 60000000L;
        for (zzlo zzloVar : this.v) {
            try {
                l(zzloVar);
                zzloVar.z();
            } catch (zzku | RuntimeException e2) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e2);
            }
        }
        this.v = new zzlo[0];
        r00 r00Var = this.K;
        if (r00Var == null) {
            r00Var = this.I;
        }
        k(r00Var);
        this.I = null;
        this.J = null;
        this.K = null;
        I(false);
        if (z) {
            zzql zzqlVar = this.u;
            if (zzqlVar != null) {
                zzqlVar.e();
                this.u = null;
            }
            this.L = null;
        }
    }

    private final void e(int i2) {
        if (this.A != i2) {
            this.A = i2;
            this.m.obtainMessage(1, i2, 0).sendToTarget();
        }
    }

    private final int h(int i2, zzlr zzlrVar, zzlr zzlrVar2) {
        int h2 = zzlrVar.h();
        int i3 = -1;
        for (int i4 = 0; i4 < h2 && i3 == -1; i4++) {
            i2 = zzlrVar.b(i2, this.p, this.o, this.B);
            i3 = zzlrVar2.f(zzlrVar.c(i2, this.p, true).f15258b);
        }
        return i3;
    }

    private final Pair<Integer, Long> i(s00 s00Var) {
        zzlr zzlrVar = s00Var.a;
        if (zzlrVar.a()) {
            zzlrVar = this.L;
        }
        try {
            Pair<Integer, Long> s = s(zzlrVar, s00Var.f12132b, s00Var.f12133c);
            zzlr zzlrVar2 = this.L;
            if (zzlrVar2 == zzlrVar) {
                return s;
            }
            int f2 = zzlrVar2.f(zzlrVar.c(((Integer) s.first).intValue(), this.p, true).f15258b);
            if (f2 != -1) {
                return Pair.create(Integer.valueOf(f2), (Long) s.second);
            }
            int h2 = h(((Integer) s.first).intValue(), zzlrVar, this.L);
            if (h2 == -1) {
                return null;
            }
            this.L.c(h2, this.p, false);
            return C(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzlk(this.L, s00Var.f12132b, s00Var.f12133c);
        }
    }

    private final Pair<Integer, Long> j(zzlr zzlrVar, int i2, long j2, long j3) {
        zzsk.g(i2, 0, zzlrVar.g());
        zzlrVar.e(i2, this.o, false, j3);
        if (j2 == -9223372036854775807L) {
            j2 = this.o.f15269h;
            if (j2 == -9223372036854775807L) {
                return null;
            }
        }
        long j4 = this.o.f15271j + j2;
        zzlrVar.c(0, this.p, false);
        return Pair.create(0, Long.valueOf(j4));
    }

    private static void k(r00 r00Var) {
        while (r00Var != null) {
            r00Var.a();
            r00Var = r00Var.l;
        }
    }

    private static void l(zzlo zzloVar) throws zzku {
        if (zzloVar.getState() == 2) {
            zzloVar.stop();
        }
    }

    private final void o(Object obj, int i2) {
        this.q = new zzle(0, 0L);
        v(obj, i2);
        this.q = new zzle(0, -9223372036854775807L);
        e(4);
        J(false);
    }

    private final void q(boolean[] zArr, int i2) throws zzku {
        this.v = new zzlo[i2];
        int i3 = 0;
        int i4 = 0;
        while (true) {
            zzlo[] zzloVarArr = this.f12026f;
            if (i3 >= zzloVarArr.length) {
                return;
            }
            zzlo zzloVar = zzloVarArr[i3];
            zzrm a = this.K.m.f15499b.a(i3);
            if (a != null) {
                int i5 = i4 + 1;
                this.v[i4] = zzloVar;
                if (zzloVar.getState() == 0) {
                    zzlq zzlqVar = this.K.m.f15501d[i3];
                    boolean z = this.x && this.A == 3;
                    boolean z2 = !zArr[i3] && z;
                    int length = a.length();
                    zzlh[] zzlhVarArr = new zzlh[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        zzlhVarArr[i6] = a.c(i6);
                    }
                    r00 r00Var = this.K;
                    zzloVar.t(zzlqVar, zzlhVarArr, r00Var.f12085d[i3], this.H, z2, r00Var.e());
                    zzso v = zzloVar.v();
                    if (v != null) {
                        if (this.t == null) {
                            this.t = v;
                            this.s = zzloVar;
                            v.d(this.r);
                        } else {
                            throw zzku.c(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z) {
                        zzloVar.start();
                    }
                }
                i4 = i5;
            }
            i3++;
        }
    }

    private final boolean r(int i2) {
        this.L.c(i2, this.p, false);
        return !this.L.d(0, this.o, false).f15266e && this.L.b(i2, this.p, this.o, this.B) == -1;
    }

    private final Pair<Integer, Long> s(zzlr zzlrVar, int i2, long j2) {
        return j(zzlrVar, i2, j2, 0L);
    }

    private final void t(long j2, long j3) {
        this.f12031k.removeMessages(2);
        long elapsedRealtime = (j2 + j3) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.f12031k.sendEmptyMessage(2);
        } else {
            this.f12031k.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final void u(r00 r00Var) throws zzku {
        if (this.K == r00Var) {
            return;
        }
        boolean[] zArr = new boolean[this.f12026f.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzlo[] zzloVarArr = this.f12026f;
            if (i2 < zzloVarArr.length) {
                zzlo zzloVar = zzloVarArr[i2];
                zArr[i2] = zzloVar.getState() != 0;
                zzrm a = r00Var.m.f15499b.a(i2);
                if (a != null) {
                    i3++;
                }
                if (zArr[i2] && (a == null || (zzloVar.y() && zzloVar.B() == this.K.f12085d[i2]))) {
                    if (zzloVar == this.s) {
                        this.f12030j.c(this.t);
                        this.t = null;
                        this.s = null;
                    }
                    l(zzloVar);
                    zzloVar.z();
                }
                i2++;
            } else {
                this.K = r00Var;
                this.m.obtainMessage(3, r00Var.m).sendToTarget();
                q(zArr, i3);
                return;
            }
        }
    }

    private final void v(Object obj, int i2) {
        this.m.obtainMessage(6, new zzlg(this.L, obj, this.q, i2)).sendToTarget();
    }

    private final long x(int i2, long j2) throws zzku {
        r00 r00Var;
        A();
        this.y = false;
        e(2);
        r00 r00Var2 = this.K;
        if (r00Var2 == null) {
            r00 r00Var3 = this.I;
            if (r00Var3 != null) {
                r00Var3.a();
            }
            r00Var = null;
        } else {
            r00Var = null;
            while (r00Var2 != null) {
                if (r00Var2.f12088g == i2 && r00Var2.f12091j) {
                    r00Var = r00Var2;
                } else {
                    r00Var2.a();
                }
                r00Var2 = r00Var2.l;
            }
        }
        r00 r00Var4 = this.K;
        if (r00Var4 != r00Var || r00Var4 != this.J) {
            for (zzlo zzloVar : this.v) {
                zzloVar.z();
            }
            this.v = new zzlo[0];
            this.t = null;
            this.s = null;
            this.K = null;
        }
        if (r00Var != null) {
            r00Var.l = null;
            this.I = r00Var;
            this.J = r00Var;
            u(r00Var);
            r00 r00Var5 = this.K;
            if (r00Var5.f12092k) {
                j2 = r00Var5.a.h(j2);
            }
            D(j2);
            H();
        } else {
            this.I = null;
            this.J = null;
            this.K = null;
            D(j2);
        }
        this.f12031k.sendEmptyMessage(2);
        return j2;
    }

    private final void z() throws zzku {
        this.y = false;
        this.f12030j.a();
        for (zzlo zzloVar : this.v) {
            zzloVar.start();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrq
    public final void a() {
        this.f12031k.sendEmptyMessage(10);
    }

    public final synchronized void b() {
        if (this.w) {
            return;
        }
        this.f12031k.sendEmptyMessage(6);
        while (!this.w) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.l.quit();
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void c(zzqj zzqjVar) {
        this.f12031k.obtainMessage(8, zzqjVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzqm
    public final void d(zzlr zzlrVar, Object obj) {
        this.f12031k.obtainMessage(7, Pair.create(zzlrVar, obj)).sendToTarget();
    }

    public final void f() {
        this.f12031k.sendEmptyMessage(5);
    }

    @Override // com.google.android.gms.internal.ads.zzqy
    public final /* synthetic */ void g(zzqj zzqjVar) {
        this.f12031k.obtainMessage(9, zzqjVar).sendToTarget();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        k(r12);
        r2.l = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0267 A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0263 A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x06b5 A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0558 A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0572 A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, LOOP:9: B:414:0x0572->B:418:0x0582, LOOP_START, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x04ed A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0548 A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:502:0x050f A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x04f4 A[Catch: IOException -> 0x082f, zzku -> 0x0834, RuntimeException -> 0x0839, TryCatch #8 {RuntimeException -> 0x0839, blocks: (B:3:0x0005, B:9:0x0019, B:13:0x0026, B:16:0x002d, B:20:0x0034, B:23:0x0046, B:25:0x004a, B:28:0x0051, B:32:0x0059, B:38:0x005e, B:39:0x0063, B:41:0x006d, B:43:0x0071, B:45:0x0075, B:46:0x0086, B:49:0x008c, B:55:0x0022, B:56:0x0090, B:66:0x00ae, B:75:0x00bc, B:78:0x00bf, B:82:0x00c9, B:87:0x00cd, B:88:0x00ce, B:92:0x00d5, B:94:0x00db, B:96:0x00e1, B:100:0x00e6, B:104:0x00eb, B:107:0x00f4, B:109:0x0116, B:110:0x011d, B:111:0x0124, B:113:0x0129, B:116:0x0134, B:118:0x013e, B:119:0x0140, B:121:0x0144, B:123:0x014a, B:126:0x0150, B:127:0x0157, B:128:0x015b, B:131:0x0162, B:133:0x0166, B:130:0x016b, B:139:0x016e, B:140:0x01a3, B:142:0x017d, B:144:0x0183, B:146:0x0189, B:148:0x0191, B:153:0x01af, B:155:0x01b7, B:158:0x01bc, B:160:0x01c0, B:162:0x01c8, B:165:0x01cd, B:167:0x01de, B:168:0x01ec, B:170:0x01f0, B:172:0x0200, B:174:0x0204, B:176:0x0212, B:178:0x0217, B:179:0x025e, B:183:0x0267, B:185:0x0271, B:187:0x027b, B:188:0x0280, B:189:0x02a8, B:191:0x02ac, B:195:0x02b7, B:199:0x02ba, B:200:0x02c7, B:203:0x02d5, B:205:0x02db, B:207:0x02ec, B:209:0x02f0, B:211:0x02fe, B:213:0x0310, B:217:0x031e, B:222:0x0323, B:223:0x0337, B:227:0x033e, B:228:0x0263, B:229:0x022f, B:231:0x0237, B:233:0x023d, B:234:0x0242, B:236:0x0342, B:237:0x034d, B:246:0x0358, B:247:0x0359, B:249:0x035d, B:251:0x0365, B:252:0x0370, B:254:0x036a, B:255:0x037c, B:257:0x0384, B:259:0x038d, B:261:0x0393, B:262:0x03b1, B:265:0x03ba, B:272:0x03db, B:275:0x03e9, B:282:0x03fd, B:285:0x040b, B:290:0x0414, B:293:0x0423, B:294:0x042a, B:297:0x042b, B:299:0x0433, B:300:0x0666, B:302:0x066c, B:304:0x0674, B:306:0x068f, B:308:0x069a, B:311:0x06a3, B:313:0x06a9, B:318:0x06b5, B:323:0x06bf, B:330:0x06c6, B:331:0x06c9, B:333:0x06cd, B:335:0x06d9, B:336:0x06ec, B:340:0x0705, B:342:0x070d, B:344:0x0713, B:345:0x0795, B:347:0x0799, B:349:0x079e, B:351:0x07a6, B:353:0x07aa, B:355:0x07b3, B:356:0x07c9, B:357:0x07af, B:359:0x07b9, B:361:0x07be, B:362:0x07c4, B:363:0x071d, B:365:0x0722, B:368:0x0729, B:370:0x0731, B:373:0x0740, B:379:0x0770, B:381:0x0778, B:382:0x0748, B:383:0x0754, B:384:0x0734, B:386:0x076a, B:389:0x077f, B:393:0x078b, B:394:0x0785, B:395:0x043b, B:397:0x043f, B:398:0x047a, B:400:0x0482, B:402:0x0554, B:404:0x0558, B:407:0x055f, B:409:0x0563, B:411:0x0567, B:412:0x056e, B:414:0x0572, B:416:0x0578, B:418:0x0582, B:420:0x05a9, B:423:0x05ae, B:425:0x05b3, B:427:0x05bd, B:429:0x05c3, B:431:0x05c9, B:433:0x05cc, B:439:0x05d0, B:441:0x05d5, B:444:0x05e5, B:449:0x05ed, B:453:0x05f0, B:455:0x05f6, B:457:0x05fa, B:461:0x0613, B:463:0x0618, B:466:0x0624, B:468:0x062a, B:470:0x063a, B:472:0x0640, B:474:0x0649, B:476:0x0652, B:480:0x0660, B:478:0x0663, B:486:0x056b, B:487:0x048a, B:489:0x048e, B:491:0x04e9, B:493:0x04ed, B:495:0x0508, B:498:0x0514, B:500:0x0548, B:501:0x054a, B:502:0x050f, B:503:0x04f4, B:504:0x0494, B:507:0x04a5, B:509:0x04d8, B:510:0x0444, B:512:0x044a, B:514:0x0450, B:517:0x045f, B:519:0x0463, B:521:0x046e, B:522:0x07cd, B:525:0x07d5, B:527:0x07db, B:529:0x07e2, B:531:0x07e7, B:533:0x07f2, B:535:0x07f8, B:538:0x0804, B:540:0x0813, B:541:0x081f), top: B:2:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r35) {
        /*
            Method dump skipped, instructions count: 2216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q00.handleMessage(android.os.Message):boolean");
    }

    public final void m(zzlr zzlrVar, int i2, long j2) {
        this.f12031k.obtainMessage(3, new s00(zzlrVar, i2, j2)).sendToTarget();
    }

    public final void n(zzql zzqlVar, boolean z) {
        this.f12031k.obtainMessage(0, 1, 0, zzqlVar).sendToTarget();
    }

    public final void p(zzky... zzkyVarArr) {
        if (this.w) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            this.C++;
            this.f12031k.obtainMessage(11, zzkyVarArr).sendToTarget();
        }
    }

    public final synchronized void w(zzky... zzkyVarArr) {
        if (this.w) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i2 = this.C;
        this.C = i2 + 1;
        this.f12031k.obtainMessage(11, zzkyVarArr).sendToTarget();
        while (this.D <= i2) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final void y(boolean z) {
        this.f12031k.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }
}
