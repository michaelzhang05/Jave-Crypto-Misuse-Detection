package C6;

import com.inmobi.cmp.ChoiceCmp;
import com.inmobi.cmp.ChoiceCmpCallback;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1350a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1351b = {1, 2, 3, 4};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1352c = {5};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1353d = {6};

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1354e;

    public final g a(String region) {
        AbstractC3159y.i(region, "region");
        String lowerCase = region.toLowerCase(Locale.ROOT);
        AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3166) {
            if (hashCode != 3180) {
                if (hashCode != 3185) {
                    if (hashCode != 3743) {
                        if (hashCode == 3755 && lowerCase.equals("va")) {
                            return g.VIRGINIA;
                        }
                    } else if (lowerCase.equals("ut")) {
                        return g.UTAH;
                    }
                } else if (lowerCase.equals("ct")) {
                    return g.CONNECTICUT;
                }
            } else if (lowerCase.equals("co")) {
                return g.COLORADO;
            }
        } else if (lowerCase.equals(DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
            return g.CALIFORNIA;
        }
        return g.NOT_APPLICABLE;
    }

    public final void b(a mspaConfig) {
        g gVar;
        ChoiceCmpCallback callback;
        AbstractC3159y.i(mspaConfig, "mspaConfig");
        if (!f1354e) {
            c(mspaConfig);
            List list = mspaConfig.f1301d;
            if (list != null) {
                d.f1320a.b(list, f1354e, h.f1349a);
                return;
            }
            return;
        }
        d dVar = d.f1320a;
        String str = d.f1321b.f2375b.f2323J;
        g c8 = dVar.c();
        String region = dVar.a();
        AbstractC3159y.i(region, "region");
        String lowerCase = region.toLowerCase(Locale.ROOT);
        AbstractC3159y.h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        if (hashCode != 3166) {
            if (hashCode != 3180) {
                if (hashCode != 3185) {
                    if (hashCode != 3743) {
                        if (hashCode == 3755 && lowerCase.equals("va")) {
                            gVar = g.VIRGINIA;
                        }
                        gVar = g.NOT_APPLICABLE;
                    } else {
                        if (lowerCase.equals("ut")) {
                            gVar = g.UTAH;
                        }
                        gVar = g.NOT_APPLICABLE;
                    }
                } else {
                    if (lowerCase.equals("ct")) {
                        gVar = g.CONNECTICUT;
                    }
                    gVar = g.NOT_APPLICABLE;
                }
            } else {
                if (lowerCase.equals("co")) {
                    gVar = g.COLORADO;
                }
                gVar = g.NOT_APPLICABLE;
            }
        } else {
            if (lowerCase.equals(DownloadCommon.DOWNLOAD_REPORT_CANCEL)) {
                gVar = g.CALIFORNIA;
            }
            gVar = g.NOT_APPLICABLE;
        }
        if (!dVar.d() || !AbstractC3159y.d(str, "NATIONAL")) {
            if (!dVar.d() || !AbstractC3159y.d(str, "STATE_AND_NATIONAL") || c8 != g.NOT_APPLICABLE) {
                if (!dVar.e() || !AbstractC3159y.d(str, "NATIONAL") || gVar != g.NOT_APPLICABLE) {
                    if ((!dVar.e() || !AbstractC3159y.d(str, "STATE_AND_NATIONAL") || gVar != c8) && (callback = ChoiceCmp.INSTANCE.getCallback()) != null) {
                        callback.onUserMovedToOtherState();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0096, code lost:
    
        if (r1 != r0.c()) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(C6.a r6) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C6.i.c(C6.a):void");
    }
}
