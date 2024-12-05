package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import cm.aptoide.pt.BuildConfig;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Set;

@zzard
/* loaded from: classes2.dex */
public final class zzapr extends zzaqb {

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f12867c = CollectionUtils.d("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");

    /* renamed from: d, reason: collision with root package name */
    private String f12868d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f12869e;

    /* renamed from: f, reason: collision with root package name */
    private int f12870f;

    /* renamed from: g, reason: collision with root package name */
    private int f12871g;

    /* renamed from: h, reason: collision with root package name */
    private int f12872h;

    /* renamed from: i, reason: collision with root package name */
    private int f12873i;

    /* renamed from: j, reason: collision with root package name */
    private int f12874j;

    /* renamed from: k, reason: collision with root package name */
    private int f12875k;
    private final Object l;
    private final zzbgz m;
    private final Activity n;
    private zzbin o;
    private ImageView p;
    private LinearLayout q;
    private zzaqc r;
    private PopupWindow s;
    private RelativeLayout t;
    private ViewGroup u;

    public zzapr(zzbgz zzbgzVar, zzaqc zzaqcVar) {
        super(zzbgzVar, "resize");
        this.f12868d = "top-right";
        this.f12869e = true;
        this.f12870f = 0;
        this.f12871g = 0;
        this.f12872h = -1;
        this.f12873i = 0;
        this.f12874j = 0;
        this.f12875k = -1;
        this.l = new Object();
        this.m = zzbgzVar;
        this.n = zzbgzVar.a();
        this.r = zzaqcVar;
    }

    public final void h(int i2, int i3, boolean z) {
        synchronized (this.l) {
            this.f12870f = i2;
            this.f12871g = i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0235 A[Catch: all -> 0x04ab, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:61:0x0138, B:67:0x0144, B:72:0x0291, B:73:0x0296, B:75:0x0298, B:77:0x02ba, B:79:0x02be, B:81:0x02ce, B:82:0x02fe, B:85:0x0330, B:86:0x0364, B:98:0x03ba, B:99:0x03e9, B:101:0x0401, B:102:0x0420, B:104:0x0428, B:105:0x042f, B:106:0x0455, B:110:0x0458, B:112:0x0468, B:113:0x0472, B:115:0x0484, B:116:0x049b, B:118:0x046d, B:119:0x03c1, B:120:0x03c8, B:121:0x03cf, B:122:0x03d6, B:123:0x03dc, B:124:0x03e3, B:125:0x0368, B:128:0x0372, B:131:0x037c, B:134:0x0386, B:137:0x0390, B:140:0x039a, B:144:0x02fb, B:145:0x049d, B:146:0x04a2, B:148:0x0235, B:150:0x0239, B:151:0x024a, B:154:0x0276, B:156:0x027a, B:157:0x0289, B:158:0x027d, B:160:0x0285, B:161:0x026e, B:163:0x0274, B:164:0x014b, B:166:0x014f, B:167:0x0155, B:176:0x01a2, B:177:0x0213, B:179:0x0216, B:181:0x0219, B:183:0x021d, B:186:0x01b0, B:187:0x01e0, B:188:0x01c1, B:189:0x01d4, B:190:0x01e3, B:191:0x01fa, B:192:0x020a, B:193:0x0159, B:196:0x0163, B:199:0x016d, B:202:0x0177, B:205:0x0181, B:208:0x018b, B:212:0x0225, B:213:0x022b, B:214:0x04a4, B:215:0x04a9), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0216 A[Catch: all -> 0x04ab, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:61:0x0138, B:67:0x0144, B:72:0x0291, B:73:0x0296, B:75:0x0298, B:77:0x02ba, B:79:0x02be, B:81:0x02ce, B:82:0x02fe, B:85:0x0330, B:86:0x0364, B:98:0x03ba, B:99:0x03e9, B:101:0x0401, B:102:0x0420, B:104:0x0428, B:105:0x042f, B:106:0x0455, B:110:0x0458, B:112:0x0468, B:113:0x0472, B:115:0x0484, B:116:0x049b, B:118:0x046d, B:119:0x03c1, B:120:0x03c8, B:121:0x03cf, B:122:0x03d6, B:123:0x03dc, B:124:0x03e3, B:125:0x0368, B:128:0x0372, B:131:0x037c, B:134:0x0386, B:137:0x0390, B:140:0x039a, B:144:0x02fb, B:145:0x049d, B:146:0x04a2, B:148:0x0235, B:150:0x0239, B:151:0x024a, B:154:0x0276, B:156:0x027a, B:157:0x0289, B:158:0x027d, B:160:0x0285, B:161:0x026e, B:163:0x0274, B:164:0x014b, B:166:0x014f, B:167:0x0155, B:176:0x01a2, B:177:0x0213, B:179:0x0216, B:181:0x0219, B:183:0x021d, B:186:0x01b0, B:187:0x01e0, B:188:0x01c1, B:189:0x01d4, B:190:0x01e3, B:191:0x01fa, B:192:0x020a, B:193:0x0159, B:196:0x0163, B:199:0x016d, B:202:0x0177, B:205:0x0181, B:208:0x018b, B:212:0x0225, B:213:0x022b, B:214:0x04a4, B:215:0x04a9), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0291 A[Catch: all -> 0x04ab, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:61:0x0138, B:67:0x0144, B:72:0x0291, B:73:0x0296, B:75:0x0298, B:77:0x02ba, B:79:0x02be, B:81:0x02ce, B:82:0x02fe, B:85:0x0330, B:86:0x0364, B:98:0x03ba, B:99:0x03e9, B:101:0x0401, B:102:0x0420, B:104:0x0428, B:105:0x042f, B:106:0x0455, B:110:0x0458, B:112:0x0468, B:113:0x0472, B:115:0x0484, B:116:0x049b, B:118:0x046d, B:119:0x03c1, B:120:0x03c8, B:121:0x03cf, B:122:0x03d6, B:123:0x03dc, B:124:0x03e3, B:125:0x0368, B:128:0x0372, B:131:0x037c, B:134:0x0386, B:137:0x0390, B:140:0x039a, B:144:0x02fb, B:145:0x049d, B:146:0x04a2, B:148:0x0235, B:150:0x0239, B:151:0x024a, B:154:0x0276, B:156:0x027a, B:157:0x0289, B:158:0x027d, B:160:0x0285, B:161:0x026e, B:163:0x0274, B:164:0x014b, B:166:0x014f, B:167:0x0155, B:176:0x01a2, B:177:0x0213, B:179:0x0216, B:181:0x0219, B:183:0x021d, B:186:0x01b0, B:187:0x01e0, B:188:0x01c1, B:189:0x01d4, B:190:0x01e3, B:191:0x01fa, B:192:0x020a, B:193:0x0159, B:196:0x0163, B:199:0x016d, B:202:0x0177, B:205:0x0181, B:208:0x018b, B:212:0x0225, B:213:0x022b, B:214:0x04a4, B:215:0x04a9), top: B:3:0x0007, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0298 A[Catch: all -> 0x04ab, TryCatch #1 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:61:0x0138, B:67:0x0144, B:72:0x0291, B:73:0x0296, B:75:0x0298, B:77:0x02ba, B:79:0x02be, B:81:0x02ce, B:82:0x02fe, B:85:0x0330, B:86:0x0364, B:98:0x03ba, B:99:0x03e9, B:101:0x0401, B:102:0x0420, B:104:0x0428, B:105:0x042f, B:106:0x0455, B:110:0x0458, B:112:0x0468, B:113:0x0472, B:115:0x0484, B:116:0x049b, B:118:0x046d, B:119:0x03c1, B:120:0x03c8, B:121:0x03cf, B:122:0x03d6, B:123:0x03dc, B:124:0x03e3, B:125:0x0368, B:128:0x0372, B:131:0x037c, B:134:0x0386, B:137:0x0390, B:140:0x039a, B:144:0x02fb, B:145:0x049d, B:146:0x04a2, B:148:0x0235, B:150:0x0239, B:151:0x024a, B:154:0x0276, B:156:0x027a, B:157:0x0289, B:158:0x027d, B:160:0x0285, B:161:0x026e, B:163:0x0274, B:164:0x014b, B:166:0x014f, B:167:0x0155, B:176:0x01a2, B:177:0x0213, B:179:0x0216, B:181:0x0219, B:183:0x021d, B:186:0x01b0, B:187:0x01e0, B:188:0x01c1, B:189:0x01d4, B:190:0x01e3, B:191:0x01fa, B:192:0x020a, B:193:0x0159, B:196:0x0163, B:199:0x016d, B:202:0x0177, B:205:0x0181, B:208:0x018b, B:212:0x0225, B:213:0x022b, B:214:0x04a4, B:215:0x04a9), top: B:3:0x0007, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.Map<java.lang.String, java.lang.String> r17) {
        /*
            Method dump skipped, instructions count: 1250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapr.i(java.util.Map):void");
    }

    public final void j(int i2, int i3) {
        this.f12870f = i2;
        this.f12871g = i3;
    }

    public final boolean k() {
        boolean z;
        synchronized (this.l) {
            z = this.s != null;
        }
        return z;
    }

    public final void l(boolean z) {
        synchronized (this.l) {
            PopupWindow popupWindow = this.s;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.t.removeView(this.m.getView());
                ViewGroup viewGroup = this.u;
                if (viewGroup != null) {
                    viewGroup.removeView(this.p);
                    this.u.addView(this.m.getView());
                    this.m.A(this.o);
                }
                if (z) {
                    g(BuildConfig.APTOIDE_THEME);
                    zzaqc zzaqcVar = this.r;
                    if (zzaqcVar != null) {
                        zzaqcVar.c();
                    }
                }
                this.s = null;
                this.t = null;
                this.u = null;
                this.q = null;
            }
        }
    }
}
