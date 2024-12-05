package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbp;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public abstract class zzdd implements zzdc {

    /* renamed from: f, reason: collision with root package name */
    protected static volatile zzdy f14697f;

    /* renamed from: g, reason: collision with root package name */
    protected MotionEvent f14698g;
    protected double p;
    private double q;
    private double r;
    protected float s;
    protected float t;
    protected float u;
    protected float v;
    protected DisplayMetrics y;

    /* renamed from: h, reason: collision with root package name */
    protected LinkedList<MotionEvent> f14699h = new LinkedList<>();

    /* renamed from: i, reason: collision with root package name */
    protected long f14700i = 0;

    /* renamed from: j, reason: collision with root package name */
    protected long f14701j = 0;

    /* renamed from: k, reason: collision with root package name */
    protected long f14702k = 0;
    protected long l = 0;
    protected long m = 0;
    protected long n = 0;
    protected long o = 0;
    private boolean w = false;
    protected boolean x = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzdd(Context context) {
        try {
            if (((Boolean) zzyt.e().c(zzacu.t2)).booleanValue()) {
                ij.f();
            } else {
                ry.a(f14697f);
            }
            this.y = context.getResources().getDisplayMetrics();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(14:5|6|7|(2:9|(10:11|12|13|(1:15)(1:46)|(2:(1:18)(1:21)|19)|22|(3:36|37|(1:39)(4:40|(2:(1:43)(1:45)|44)|25|26))|24|25|26))|54|12|13|(0)(0)|(0)|22|(0)|24|25|26)|57|7|(0)|54|12|13|(0)(0)|(0)|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0054, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0056, code lost:
    
        if (r1 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0058, code lost:
    
        if (r12 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005a, code lost:
    
        r10 = 1003;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005f, code lost:
    
        r1.c(r10, -1, java.lang.System.currentTimeMillis() - r2, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005d, code lost:
    
        r10 = okhttp3.internal.ws.WebSocketProtocol.CLOSE_CLIENT_GOING_AWAY;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[Catch: Exception -> 0x0054, TRY_ENTER, TryCatch #2 {Exception -> 0x0054, blocks: (B:15:0x0035, B:19:0x004b, B:46:0x003d), top: B:13:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[Catch: Exception -> 0x0054, TryCatch #2 {Exception -> 0x0054, blocks: (B:15:0x0035, B:19:0x004b, B:46:0x003d), top: B:13:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String d(android.content.Context r10, java.lang.String r11, boolean r12, android.view.View r13, android.app.Activity r14, byte[] r15) {
        /*
            r9 = this;
            r0 = 0
            if (r15 == 0) goto Lf
            int r1 = r15.length
            if (r1 <= 0) goto Lf
            com.google.android.gms.internal.ads.zzdno r1 = com.google.android.gms.internal.ads.zzdno.e()     // Catch: com.google.android.gms.internal.ads.zzdok -> Lf
            com.google.android.gms.internal.ads.zzbk$zza r15 = com.google.android.gms.internal.ads.zzbk.zza.x(r15, r1)     // Catch: com.google.android.gms.internal.ads.zzdok -> Lf
            goto L10
        Lf:
            r15 = r0
        L10:
            com.google.android.gms.internal.ads.zzdy r1 = com.google.android.gms.internal.ads.zzdd.f14697f
            if (r1 == 0) goto L2d
            com.google.android.gms.internal.ads.zzacj<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.zzacu.j2
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.e()
            java.lang.Object r1 = r2.c(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L2d
            com.google.android.gms.internal.ads.zzdy r1 = com.google.android.gms.internal.ads.zzdd.f14697f
            com.google.android.gms.internal.ads.zzda r1 = r1.w()
            goto L2e
        L2d:
            r1 = r0
        L2e:
            long r2 = java.lang.System.currentTimeMillis()
            r8 = -1
            if (r12 == 0) goto L3d
            com.google.android.gms.internal.ads.zzbp$zza$zza r0 = r9.b(r10, r13, r14)     // Catch: java.lang.Exception -> L54
            r10 = 1
            r9.w = r10     // Catch: java.lang.Exception -> L54
            goto L42
        L3d:
            com.google.android.gms.internal.ads.zzbp$zza$zza r10 = r9.c(r10, r15)     // Catch: java.lang.Exception -> L54
            r0 = r10
        L42:
            if (r1 == 0) goto L6b
            if (r12 == 0) goto L49
            r10 = 1002(0x3ea, float:1.404E-42)
            goto L4b
        L49:
            r10 = 1000(0x3e8, float:1.401E-42)
        L4b:
            long r13 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L54
            long r13 = r13 - r2
            r1.b(r10, r8, r13)     // Catch: java.lang.Exception -> L54
            goto L6b
        L54:
            r10 = move-exception
            r7 = r10
            if (r1 == 0) goto L6b
            if (r12 == 0) goto L5d
            r10 = 1003(0x3eb, float:1.406E-42)
            goto L5f
        L5d:
            r10 = 1001(0x3e9, float:1.403E-42)
        L5f:
            r4 = -1
            long r13 = java.lang.System.currentTimeMillis()
            long r5 = r13 - r2
            r2 = r1
            r3 = r10
            r2.c(r3, r4, r5, r7)
        L6b:
            long r13 = java.lang.System.currentTimeMillis()
            if (r0 == 0) goto L9e
            com.google.android.gms.internal.ads.zzdpk r10 = r0.J()     // Catch: java.lang.Exception -> La4
            com.google.android.gms.internal.ads.zzdob r10 = (com.google.android.gms.internal.ads.zzdob) r10     // Catch: java.lang.Exception -> La4
            com.google.android.gms.internal.ads.zzbp$zza r10 = (com.google.android.gms.internal.ads.zzbp.zza) r10     // Catch: java.lang.Exception -> La4
            int r10 = r10.i()     // Catch: java.lang.Exception -> La4
            if (r10 != 0) goto L80
            goto L9e
        L80:
            com.google.android.gms.internal.ads.zzdpk r10 = r0.J()     // Catch: java.lang.Exception -> La4
            com.google.android.gms.internal.ads.zzdob r10 = (com.google.android.gms.internal.ads.zzdob) r10     // Catch: java.lang.Exception -> La4
            com.google.android.gms.internal.ads.zzbp$zza r10 = (com.google.android.gms.internal.ads.zzbp.zza) r10     // Catch: java.lang.Exception -> La4
            java.lang.String r10 = com.google.android.gms.internal.ads.ij.h(r10, r11)     // Catch: java.lang.Exception -> La4
            if (r1 == 0) goto Lc3
            if (r12 == 0) goto L93
            r11 = 1006(0x3ee, float:1.41E-42)
            goto L95
        L93:
            r11 = 1004(0x3ec, float:1.407E-42)
        L95:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> La4
            long r2 = r2 - r13
            r1.b(r11, r8, r2)     // Catch: java.lang.Exception -> La4
            goto Lc3
        L9e:
            r10 = 5
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch: java.lang.Exception -> La4
            goto Lc3
        La4:
            r10 = move-exception
            r7 = r10
            r10 = 7
            java.lang.String r10 = java.lang.Integer.toString(r10)
            if (r1 == 0) goto Lc3
            if (r12 == 0) goto Lb4
            r11 = 1007(0x3ef, float:1.411E-42)
            r3 = 1007(0x3ef, float:1.411E-42)
            goto Lb8
        Lb4:
            r11 = 1005(0x3ed, float:1.408E-42)
            r3 = 1005(0x3ed, float:1.408E-42)
        Lb8:
            r4 = -1
            long r11 = java.lang.System.currentTimeMillis()
            long r5 = r11 - r13
            r2 = r1
            r2.c(r3, r4, r5, r7)
        Lc3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdd.d(android.content.Context, java.lang.String, boolean, android.view.View, android.app.Activity, byte[]):java.lang.String");
    }

    protected abstract long a(StackTraceElement[] stackTraceElementArr) throws zzdv;

    protected abstract zzbp.zza.C0173zza b(Context context, View view, Activity activity);

    protected abstract zzbp.zza.C0173zza c(Context context, zzbk.zza zzaVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract zzee e(MotionEvent motionEvent) throws zzdv;

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context) {
        if (zzef.a()) {
            if (((Boolean) zzyt.e().c(zzacu.v2)).booleanValue()) {
                throw new IllegalStateException("The caller must not be called from the UI thread.");
            }
        }
        return d(context, null, false, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public void zzb(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context, String str, View view) {
        return zza(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final String zza(Context context, String str, View view, Activity activity) {
        return d(context, str, true, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final void zza(MotionEvent motionEvent) {
        boolean z = false;
        if (this.w) {
            this.l = 0L;
            this.f14702k = 0L;
            this.f14701j = 0L;
            this.f14700i = 0L;
            this.m = 0L;
            this.o = 0L;
            this.n = 0L;
            Iterator<MotionEvent> it = this.f14699h.iterator();
            while (it.hasNext()) {
                it.next().recycle();
            }
            this.f14699h.clear();
            this.f14698g = null;
            this.w = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.p = 0.0d;
            this.q = motionEvent.getRawX();
            this.r = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d2 = this.q;
            Double.isNaN(rawX);
            double d3 = rawX - d2;
            double d4 = this.r;
            Double.isNaN(rawY);
            double d5 = rawY - d4;
            this.p += Math.sqrt((d3 * d3) + (d5 * d5));
            this.q = rawX;
            this.r = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    this.f14698g = obtain;
                    this.f14699h.add(obtain);
                    if (this.f14699h.size() > 6) {
                        this.f14699h.remove().recycle();
                    }
                    this.f14702k++;
                    this.m = a(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.f14701j += motionEvent.getHistorySize() + 1;
                    zzee e2 = e(motionEvent);
                    if ((e2 == null || e2.f15018e == null || e2.f15021h == null) ? false : true) {
                        this.n += e2.f15018e.longValue() + e2.f15021h.longValue();
                    }
                    if (this.y != null && e2 != null && e2.f15019f != null && e2.f15022i != null) {
                        z = true;
                    }
                    if (z) {
                        this.o += e2.f15019f.longValue() + e2.f15022i.longValue();
                    }
                } else if (action2 == 3) {
                    this.l++;
                }
            } catch (zzdv unused) {
            }
        } else {
            this.s = motionEvent.getX();
            this.t = motionEvent.getY();
            this.u = motionEvent.getRawX();
            this.v = motionEvent.getRawY();
            this.f14700i++;
        }
        this.x = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdc
    public final void zza(int i2, int i3, int i4) {
        MotionEvent motionEvent = this.f14698g;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        DisplayMetrics displayMetrics = this.y;
        if (displayMetrics != null) {
            float f2 = displayMetrics.density;
            this.f14698g = MotionEvent.obtain(0L, i4, 1, i2 * f2, i3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f14698g = null;
        }
        this.x = false;
    }
}
