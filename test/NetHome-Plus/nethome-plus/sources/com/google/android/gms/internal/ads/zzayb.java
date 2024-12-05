package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzayb {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private String f13088b;

    /* renamed from: c, reason: collision with root package name */
    private String f13089c;

    /* renamed from: d, reason: collision with root package name */
    private String f13090d;

    /* renamed from: e, reason: collision with root package name */
    private String f13091e;

    /* renamed from: f, reason: collision with root package name */
    private int f13092f;

    /* renamed from: g, reason: collision with root package name */
    private int f13093g;

    /* renamed from: h, reason: collision with root package name */
    private PointF f13094h;

    /* renamed from: i, reason: collision with root package name */
    private PointF f13095i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f13096j;

    /* renamed from: k, reason: collision with root package name */
    private Runnable f13097k;

    public zzayb(Context context) {
        this.f13092f = 0;
        this.f13097k = new Runnable(this) { // from class: com.google.android.gms.internal.ads.m5

            /* renamed from: f, reason: collision with root package name */
            private final zzayb f11797f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11797f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11797f.m();
            }
        };
        this.a = context;
        this.f13093g = ViewConfiguration.get(context).getScaledTouchSlop();
        zzk.zzlu().b();
        this.f13096j = zzk.zzlu().a();
    }

    private static int c(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    private final boolean f(float f2, float f3, float f4, float f5) {
        return Math.abs(this.f13094h.x - f2) < ((float) this.f13093g) && Math.abs(this.f13094h.y - f3) < ((float) this.f13093g) && Math.abs(this.f13095i.x - f4) < ((float) this.f13093g) && Math.abs(this.f13095i.y - f5) < ((float) this.f13093g);
    }

    public final void a(String str) {
        this.f13089c = str;
    }

    public final void b() {
        try {
            if (!(this.a instanceof Activity)) {
                zzbad.h("Can not create dialog without Activity Context");
                return;
            }
            String str = !TextUtils.isEmpty(zzk.zzlq().l()) ? "Creative Preview (Enabled)" : "Creative Preview";
            String str2 = zzk.zzlq().m() ? "Troubleshooting (Enabled)" : "Troubleshooting";
            ArrayList arrayList = new ArrayList();
            final int c2 = c(arrayList, "Ad Information", true);
            final int c3 = c(arrayList, str, true);
            final int c4 = c(arrayList, str2, true);
            AlertDialog.Builder builder = new AlertDialog.Builder(this.a, zzk.zzli().v());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, c2, c3, c4) { // from class: com.google.android.gms.internal.ads.n5

                /* renamed from: f, reason: collision with root package name */
                private final zzayb f11851f;

                /* renamed from: g, reason: collision with root package name */
                private final int f11852g;

                /* renamed from: h, reason: collision with root package name */
                private final int f11853h;

                /* renamed from: i, reason: collision with root package name */
                private final int f11854i;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f11851f = this;
                    this.f11852g = c2;
                    this.f11853h = c3;
                    this.f11854i = c4;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f11851f.d(this.f11852g, this.f11853h, this.f11854i, dialogInterface, i2);
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e2) {
            zzawz.l(HttpUrl.FRAGMENT_ENCODE_SET, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void d(int r1, int r2, int r3, android.content.DialogInterface r4, int r5) {
        /*
            r0 = this;
            if (r5 != r1) goto L9b
            android.content.Context r1 = r0.a
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 != 0) goto Le
            java.lang.String r1 = "Can not create dialog without Activity Context"
            com.google.android.gms.internal.ads.zzbad.h(r1)
            return
        Le:
            java.lang.String r1 = r0.f13088b
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            java.lang.String r2 = "\\+"
            java.lang.String r3 = "%20"
            java.lang.String r1 = r1.replaceAll(r2, r3)
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.encodedQuery(r1)
            android.net.Uri r1 = r1.build()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.google.android.gms.ads.internal.zzk.zzlg()
            java.util.Map r1 = com.google.android.gms.internal.ads.zzaxi.X(r1)
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L3f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L62
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r5 = " = "
            r2.append(r5)
            java.lang.Object r4 = r1.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r2.append(r4)
            java.lang.String r4 = "\n\n"
            r2.append(r4)
            goto L3f
        L62:
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.trim()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L71
            goto L73
        L71:
            java.lang.String r1 = "No debug information"
        L73:
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            android.content.Context r3 = r0.a
            r2.<init>(r3)
            r2.setMessage(r1)
            java.lang.String r3 = "Ad Information"
            r2.setTitle(r3)
            com.google.android.gms.internal.ads.o5 r3 = new com.google.android.gms.internal.ads.o5
            r3.<init>(r0, r1)
            java.lang.String r1 = "Share"
            r2.setPositiveButton(r1, r3)
            android.content.DialogInterface$OnClickListener r1 = com.google.android.gms.internal.ads.p5.f11975f
            java.lang.String r3 = "Close"
            r2.setNegativeButton(r3, r1)
            android.app.AlertDialog r1 = r2.create()
            r1.show()
            return
        L9b:
            if (r5 != r2) goto Lab
            java.lang.String r1 = "Debug mode [Creative Preview] selected."
            com.google.android.gms.internal.ads.zzbad.e(r1)
            com.google.android.gms.internal.ads.q5 r1 = new com.google.android.gms.internal.ads.q5
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzaxg.b(r1)
            return
        Lab:
            if (r5 != r3) goto Lba
            java.lang.String r1 = "Debug mode [Troubleshooting] selected."
            com.google.android.gms.internal.ads.zzbad.e(r1)
            com.google.android.gms.internal.ads.r5 r1 = new com.google.android.gms.internal.ads.r5
            r1.<init>(r0)
            com.google.android.gms.internal.ads.zzaxg.b(r1)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayb.d(int, int, int, android.content.DialogInterface, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void e(String str, DialogInterface dialogInterface, int i2) {
        zzk.zzlg();
        zzaxi.i(this.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.MotionEvent r11) {
        /*
            r10 = this;
            int r0 = r11.getActionMasked()
            int r1 = r11.getHistorySize()
            int r2 = r11.getPointerCount()
            r3 = 0
            if (r0 != 0) goto L21
            r10.f13092f = r3
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r3)
            float r11 = r11.getY(r3)
            r0.<init>(r1, r11)
            r10.f13094h = r0
            return
        L21:
            int r4 = r10.f13092f
            r5 = -1
            if (r4 != r5) goto L27
            return
        L27:
            r6 = 5
            r7 = 1
            if (r4 != 0) goto L56
            if (r0 != r6) goto L56
            r10.f13092f = r6
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r11.getX(r7)
            float r11 = r11.getY(r7)
            r0.<init>(r1, r11)
            r10.f13095i = r0
            android.os.Handler r11 = r10.f13096j
            java.lang.Runnable r0 = r10.f13097k
            com.google.android.gms.internal.ads.zzacj<java.lang.Long> r1 = com.google.android.gms.internal.ads.zzacu.H3
            com.google.android.gms.internal.ads.zzacr r2 = com.google.android.gms.internal.ads.zzyt.e()
            java.lang.Object r1 = r2.c(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r11.postDelayed(r0, r1)
            return
        L56:
            if (r4 != r6) goto La0
            r4 = 2
            if (r2 == r4) goto L5d
        L5b:
            r3 = 1
            goto L95
        L5d:
            if (r0 != r4) goto L95
            r0 = 0
            r2 = 0
        L61:
            if (r0 >= r1) goto L7d
            float r4 = r11.getHistoricalX(r3, r0)
            float r6 = r11.getHistoricalY(r3, r0)
            float r8 = r11.getHistoricalX(r7, r0)
            float r9 = r11.getHistoricalY(r7, r0)
            boolean r4 = r10.f(r4, r6, r8, r9)
            if (r4 != 0) goto L7a
            r2 = 1
        L7a:
            int r0 = r0 + 1
            goto L61
        L7d:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r11.getX(r7)
            float r11 = r11.getY(r7)
            boolean r11 = r10.f(r0, r1, r3, r11)
            if (r11 != 0) goto L94
            goto L5b
        L94:
            r3 = r2
        L95:
            if (r3 == 0) goto La0
            r10.f13092f = r5
            android.os.Handler r11 = r10.f13096j
            java.lang.Runnable r0 = r10.f13097k
            r11.removeCallbacks(r0)
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzayb.g(android.view.MotionEvent):void");
    }

    public final void h(String str) {
        this.f13088b = str;
    }

    public final void i(String str) {
        this.f13091e = str;
    }

    public final void j(String str) {
        this.f13090d = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void k() {
        zzk.zzlq().a(this.a, this.f13089c, this.f13090d, this.f13091e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void l() {
        zzk.zzlq().g(this.a, this.f13089c, this.f13090d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m() {
        this.f13092f = 4;
        b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f13088b);
        sb.append(",DebugSignal: ");
        sb.append(this.f13091e);
        sb.append(",AFMA Version: ");
        sb.append(this.f13090d);
        sb.append(",Ad Unit ID: ");
        sb.append(this.f13089c);
        sb.append("}");
        return sb.toString();
    }

    public zzayb(Context context, String str) {
        this(context);
        this.f13088b = str;
    }
}
