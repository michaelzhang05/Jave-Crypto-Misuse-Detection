package androidx.compose.material3.tokens;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;

/* loaded from: classes.dex */
public final class PaletteTokens {
    public static final PaletteTokens INSTANCE = new PaletteTokens();
    private static final long Black = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Error0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Error10 = ColorKt.Color$default(65, 14, 11, 0, 8, null);
    private static final long Error100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Error20 = ColorKt.Color$default(96, 20, 16, 0, 8, null);
    private static final long Error30 = ColorKt.Color$default(140, 29, 24, 0, 8, null);
    private static final long Error40 = ColorKt.Color$default(179, 38, 30, 0, 8, null);
    private static final long Error50 = ColorKt.Color$default(220, 54, 46, 0, 8, null);
    private static final long Error60 = ColorKt.Color$default(228, 105, 98, 0, 8, null);
    private static final long Error70 = ColorKt.Color$default(236, 146, 142, 0, 8, null);
    private static final long Error80 = ColorKt.Color$default(242, 184, 181, 0, 8, null);
    private static final long Error90 = ColorKt.Color$default(249, 222, 220, 0, 8, null);
    private static final long Error95 = ColorKt.Color$default(252, 238, 238, 0, 8, null);
    private static final long Error99 = ColorKt.Color$default(255, 251, 249, 0, 8, null);
    private static final long Neutral0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Neutral10 = ColorKt.Color$default(28, 27, 31, 0, 8, null);
    private static final long Neutral100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Neutral20 = ColorKt.Color$default(49, 48, 51, 0, 8, null);
    private static final long Neutral30 = ColorKt.Color$default(72, 70, 73, 0, 8, null);
    private static final long Neutral40 = ColorKt.Color$default(96, 93, 98, 0, 8, null);
    private static final long Neutral50 = ColorKt.Color$default(120, 117, 121, 0, 8, null);
    private static final long Neutral60 = ColorKt.Color$default(147, 144, 148, 0, 8, null);
    private static final long Neutral70 = ColorKt.Color$default(174, 170, 174, 0, 8, null);
    private static final long Neutral80 = ColorKt.Color$default(ComposerKt.providerKey, 197, ComposerKt.compositionLocalMapKey, 0, 8, null);
    private static final long Neutral90 = ColorKt.Color$default(230, 225, 229, 0, 8, null);
    private static final long Neutral95 = ColorKt.Color$default(244, 239, 244, 0, 8, null);
    private static final long Neutral99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
    private static final long NeutralVariant0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long NeutralVariant10 = ColorKt.Color$default(29, 26, 34, 0, 8, null);
    private static final long NeutralVariant100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long NeutralVariant20 = ColorKt.Color$default(50, 47, 55, 0, 8, null);
    private static final long NeutralVariant30 = ColorKt.Color$default(73, 69, 79, 0, 8, null);
    private static final long NeutralVariant40 = ColorKt.Color$default(96, 93, 102, 0, 8, null);
    private static final long NeutralVariant50 = ColorKt.Color$default(121, 116, 126, 0, 8, null);
    private static final long NeutralVariant60 = ColorKt.Color$default(147, 143, 153, 0, 8, null);
    private static final long NeutralVariant70 = ColorKt.Color$default(174, 169, SubsamplingScaleImageView.ORIENTATION_180, 0, 8, null);
    private static final long NeutralVariant80 = ColorKt.Color$default(ComposerKt.compositionLocalMapKey, 196, 208, 0, 8, null);
    private static final long NeutralVariant90 = ColorKt.Color$default(231, 224, 236, 0, 8, null);
    private static final long NeutralVariant95 = ColorKt.Color$default(245, 238, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, 8, null);
    private static final long NeutralVariant99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
    private static final long Primary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Primary10 = ColorKt.Color$default(33, 0, 93, 0, 8, null);
    private static final long Primary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Primary20 = ColorKt.Color$default(56, 30, 114, 0, 8, null);
    private static final long Primary30 = ColorKt.Color$default(79, 55, 139, 0, 8, null);
    private static final long Primary40 = ColorKt.Color$default(103, 80, 164, 0, 8, null);
    private static final long Primary50 = ColorKt.Color$default(127, 103, 190, 0, 8, null);
    private static final long Primary60 = ColorKt.Color$default(154, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 219, 0, 8, null);
    private static final long Primary70 = ColorKt.Color$default(182, 157, 248, 0, 8, null);
    private static final long Primary80 = ColorKt.Color$default(208, 188, 255, 0, 8, null);
    private static final long Primary90 = ColorKt.Color$default(234, 221, 255, 0, 8, null);
    private static final long Primary95 = ColorKt.Color$default(246, 237, 255, 0, 8, null);
    private static final long Primary99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
    private static final long Secondary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Secondary10 = ColorKt.Color$default(29, 25, 43, 0, 8, null);
    private static final long Secondary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Secondary20 = ColorKt.Color$default(51, 45, 65, 0, 8, null);
    private static final long Secondary30 = ColorKt.Color$default(74, 68, 88, 0, 8, null);
    private static final long Secondary40 = ColorKt.Color$default(98, 91, 113, 0, 8, null);
    private static final long Secondary50 = ColorKt.Color$default(122, 114, 137, 0, 8, null);
    private static final long Secondary60 = ColorKt.Color$default(149, 141, 165, 0, 8, null);
    private static final long Secondary70 = ColorKt.Color$default(176, 167, PsExtractor.AUDIO_STREAM, 0, 8, null);
    private static final long Secondary80 = ColorKt.Color$default(ComposerKt.providerMapsKey, 194, 220, 0, 8, null);
    private static final long Secondary90 = ColorKt.Color$default(232, 222, 248, 0, 8, null);
    private static final long Secondary95 = ColorKt.Color$default(246, 237, 255, 0, 8, null);
    private static final long Secondary99 = ColorKt.Color$default(255, 251, 254, 0, 8, null);
    private static final long Tertiary0 = ColorKt.Color$default(0, 0, 0, 0, 8, null);
    private static final long Tertiary10 = ColorKt.Color$default(49, 17, 29, 0, 8, null);
    private static final long Tertiary100 = ColorKt.Color$default(255, 255, 255, 0, 8, null);
    private static final long Tertiary20 = ColorKt.Color$default(73, 37, 50, 0, 8, null);
    private static final long Tertiary30 = ColorKt.Color$default(99, 59, 72, 0, 8, null);
    private static final long Tertiary40 = ColorKt.Color$default(125, 82, 96, 0, 8, null);
    private static final long Tertiary50 = ColorKt.Color$default(152, 105, 119, 0, 8, null);
    private static final long Tertiary60 = ColorKt.Color$default(181, 131, 146, 0, 8, null);
    private static final long Tertiary70 = ColorKt.Color$default(210, 157, 172, 0, 8, null);
    private static final long Tertiary80 = ColorKt.Color$default(239, 184, 200, 0, 8, null);
    private static final long Tertiary90 = ColorKt.Color$default(255, 216, 228, 0, 8, null);
    private static final long Tertiary95 = ColorKt.Color$default(255, 236, 241, 0, 8, null);
    private static final long Tertiary99 = ColorKt.Color$default(255, 251, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 0, 8, null);
    private static final long White = ColorKt.Color$default(255, 255, 255, 0, 8, null);

    private PaletteTokens() {
    }

    /* renamed from: getBlack-0d7_KjU, reason: not valid java name */
    public final long m2267getBlack0d7_KjU() {
        return Black;
    }

    /* renamed from: getError0-0d7_KjU, reason: not valid java name */
    public final long m2268getError00d7_KjU() {
        return Error0;
    }

    /* renamed from: getError10-0d7_KjU, reason: not valid java name */
    public final long m2269getError100d7_KjU() {
        return Error10;
    }

    /* renamed from: getError100-0d7_KjU, reason: not valid java name */
    public final long m2270getError1000d7_KjU() {
        return Error100;
    }

    /* renamed from: getError20-0d7_KjU, reason: not valid java name */
    public final long m2271getError200d7_KjU() {
        return Error20;
    }

    /* renamed from: getError30-0d7_KjU, reason: not valid java name */
    public final long m2272getError300d7_KjU() {
        return Error30;
    }

    /* renamed from: getError40-0d7_KjU, reason: not valid java name */
    public final long m2273getError400d7_KjU() {
        return Error40;
    }

    /* renamed from: getError50-0d7_KjU, reason: not valid java name */
    public final long m2274getError500d7_KjU() {
        return Error50;
    }

    /* renamed from: getError60-0d7_KjU, reason: not valid java name */
    public final long m2275getError600d7_KjU() {
        return Error60;
    }

    /* renamed from: getError70-0d7_KjU, reason: not valid java name */
    public final long m2276getError700d7_KjU() {
        return Error70;
    }

    /* renamed from: getError80-0d7_KjU, reason: not valid java name */
    public final long m2277getError800d7_KjU() {
        return Error80;
    }

    /* renamed from: getError90-0d7_KjU, reason: not valid java name */
    public final long m2278getError900d7_KjU() {
        return Error90;
    }

    /* renamed from: getError95-0d7_KjU, reason: not valid java name */
    public final long m2279getError950d7_KjU() {
        return Error95;
    }

    /* renamed from: getError99-0d7_KjU, reason: not valid java name */
    public final long m2280getError990d7_KjU() {
        return Error99;
    }

    /* renamed from: getNeutral0-0d7_KjU, reason: not valid java name */
    public final long m2281getNeutral00d7_KjU() {
        return Neutral0;
    }

    /* renamed from: getNeutral10-0d7_KjU, reason: not valid java name */
    public final long m2282getNeutral100d7_KjU() {
        return Neutral10;
    }

    /* renamed from: getNeutral100-0d7_KjU, reason: not valid java name */
    public final long m2283getNeutral1000d7_KjU() {
        return Neutral100;
    }

    /* renamed from: getNeutral20-0d7_KjU, reason: not valid java name */
    public final long m2284getNeutral200d7_KjU() {
        return Neutral20;
    }

    /* renamed from: getNeutral30-0d7_KjU, reason: not valid java name */
    public final long m2285getNeutral300d7_KjU() {
        return Neutral30;
    }

    /* renamed from: getNeutral40-0d7_KjU, reason: not valid java name */
    public final long m2286getNeutral400d7_KjU() {
        return Neutral40;
    }

    /* renamed from: getNeutral50-0d7_KjU, reason: not valid java name */
    public final long m2287getNeutral500d7_KjU() {
        return Neutral50;
    }

    /* renamed from: getNeutral60-0d7_KjU, reason: not valid java name */
    public final long m2288getNeutral600d7_KjU() {
        return Neutral60;
    }

    /* renamed from: getNeutral70-0d7_KjU, reason: not valid java name */
    public final long m2289getNeutral700d7_KjU() {
        return Neutral70;
    }

    /* renamed from: getNeutral80-0d7_KjU, reason: not valid java name */
    public final long m2290getNeutral800d7_KjU() {
        return Neutral80;
    }

    /* renamed from: getNeutral90-0d7_KjU, reason: not valid java name */
    public final long m2291getNeutral900d7_KjU() {
        return Neutral90;
    }

    /* renamed from: getNeutral95-0d7_KjU, reason: not valid java name */
    public final long m2292getNeutral950d7_KjU() {
        return Neutral95;
    }

    /* renamed from: getNeutral99-0d7_KjU, reason: not valid java name */
    public final long m2293getNeutral990d7_KjU() {
        return Neutral99;
    }

    /* renamed from: getNeutralVariant0-0d7_KjU, reason: not valid java name */
    public final long m2294getNeutralVariant00d7_KjU() {
        return NeutralVariant0;
    }

    /* renamed from: getNeutralVariant10-0d7_KjU, reason: not valid java name */
    public final long m2295getNeutralVariant100d7_KjU() {
        return NeutralVariant10;
    }

    /* renamed from: getNeutralVariant100-0d7_KjU, reason: not valid java name */
    public final long m2296getNeutralVariant1000d7_KjU() {
        return NeutralVariant100;
    }

    /* renamed from: getNeutralVariant20-0d7_KjU, reason: not valid java name */
    public final long m2297getNeutralVariant200d7_KjU() {
        return NeutralVariant20;
    }

    /* renamed from: getNeutralVariant30-0d7_KjU, reason: not valid java name */
    public final long m2298getNeutralVariant300d7_KjU() {
        return NeutralVariant30;
    }

    /* renamed from: getNeutralVariant40-0d7_KjU, reason: not valid java name */
    public final long m2299getNeutralVariant400d7_KjU() {
        return NeutralVariant40;
    }

    /* renamed from: getNeutralVariant50-0d7_KjU, reason: not valid java name */
    public final long m2300getNeutralVariant500d7_KjU() {
        return NeutralVariant50;
    }

    /* renamed from: getNeutralVariant60-0d7_KjU, reason: not valid java name */
    public final long m2301getNeutralVariant600d7_KjU() {
        return NeutralVariant60;
    }

    /* renamed from: getNeutralVariant70-0d7_KjU, reason: not valid java name */
    public final long m2302getNeutralVariant700d7_KjU() {
        return NeutralVariant70;
    }

    /* renamed from: getNeutralVariant80-0d7_KjU, reason: not valid java name */
    public final long m2303getNeutralVariant800d7_KjU() {
        return NeutralVariant80;
    }

    /* renamed from: getNeutralVariant90-0d7_KjU, reason: not valid java name */
    public final long m2304getNeutralVariant900d7_KjU() {
        return NeutralVariant90;
    }

    /* renamed from: getNeutralVariant95-0d7_KjU, reason: not valid java name */
    public final long m2305getNeutralVariant950d7_KjU() {
        return NeutralVariant95;
    }

    /* renamed from: getNeutralVariant99-0d7_KjU, reason: not valid java name */
    public final long m2306getNeutralVariant990d7_KjU() {
        return NeutralVariant99;
    }

    /* renamed from: getPrimary0-0d7_KjU, reason: not valid java name */
    public final long m2307getPrimary00d7_KjU() {
        return Primary0;
    }

    /* renamed from: getPrimary10-0d7_KjU, reason: not valid java name */
    public final long m2308getPrimary100d7_KjU() {
        return Primary10;
    }

    /* renamed from: getPrimary100-0d7_KjU, reason: not valid java name */
    public final long m2309getPrimary1000d7_KjU() {
        return Primary100;
    }

    /* renamed from: getPrimary20-0d7_KjU, reason: not valid java name */
    public final long m2310getPrimary200d7_KjU() {
        return Primary20;
    }

    /* renamed from: getPrimary30-0d7_KjU, reason: not valid java name */
    public final long m2311getPrimary300d7_KjU() {
        return Primary30;
    }

    /* renamed from: getPrimary40-0d7_KjU, reason: not valid java name */
    public final long m2312getPrimary400d7_KjU() {
        return Primary40;
    }

    /* renamed from: getPrimary50-0d7_KjU, reason: not valid java name */
    public final long m2313getPrimary500d7_KjU() {
        return Primary50;
    }

    /* renamed from: getPrimary60-0d7_KjU, reason: not valid java name */
    public final long m2314getPrimary600d7_KjU() {
        return Primary60;
    }

    /* renamed from: getPrimary70-0d7_KjU, reason: not valid java name */
    public final long m2315getPrimary700d7_KjU() {
        return Primary70;
    }

    /* renamed from: getPrimary80-0d7_KjU, reason: not valid java name */
    public final long m2316getPrimary800d7_KjU() {
        return Primary80;
    }

    /* renamed from: getPrimary90-0d7_KjU, reason: not valid java name */
    public final long m2317getPrimary900d7_KjU() {
        return Primary90;
    }

    /* renamed from: getPrimary95-0d7_KjU, reason: not valid java name */
    public final long m2318getPrimary950d7_KjU() {
        return Primary95;
    }

    /* renamed from: getPrimary99-0d7_KjU, reason: not valid java name */
    public final long m2319getPrimary990d7_KjU() {
        return Primary99;
    }

    /* renamed from: getSecondary0-0d7_KjU, reason: not valid java name */
    public final long m2320getSecondary00d7_KjU() {
        return Secondary0;
    }

    /* renamed from: getSecondary10-0d7_KjU, reason: not valid java name */
    public final long m2321getSecondary100d7_KjU() {
        return Secondary10;
    }

    /* renamed from: getSecondary100-0d7_KjU, reason: not valid java name */
    public final long m2322getSecondary1000d7_KjU() {
        return Secondary100;
    }

    /* renamed from: getSecondary20-0d7_KjU, reason: not valid java name */
    public final long m2323getSecondary200d7_KjU() {
        return Secondary20;
    }

    /* renamed from: getSecondary30-0d7_KjU, reason: not valid java name */
    public final long m2324getSecondary300d7_KjU() {
        return Secondary30;
    }

    /* renamed from: getSecondary40-0d7_KjU, reason: not valid java name */
    public final long m2325getSecondary400d7_KjU() {
        return Secondary40;
    }

    /* renamed from: getSecondary50-0d7_KjU, reason: not valid java name */
    public final long m2326getSecondary500d7_KjU() {
        return Secondary50;
    }

    /* renamed from: getSecondary60-0d7_KjU, reason: not valid java name */
    public final long m2327getSecondary600d7_KjU() {
        return Secondary60;
    }

    /* renamed from: getSecondary70-0d7_KjU, reason: not valid java name */
    public final long m2328getSecondary700d7_KjU() {
        return Secondary70;
    }

    /* renamed from: getSecondary80-0d7_KjU, reason: not valid java name */
    public final long m2329getSecondary800d7_KjU() {
        return Secondary80;
    }

    /* renamed from: getSecondary90-0d7_KjU, reason: not valid java name */
    public final long m2330getSecondary900d7_KjU() {
        return Secondary90;
    }

    /* renamed from: getSecondary95-0d7_KjU, reason: not valid java name */
    public final long m2331getSecondary950d7_KjU() {
        return Secondary95;
    }

    /* renamed from: getSecondary99-0d7_KjU, reason: not valid java name */
    public final long m2332getSecondary990d7_KjU() {
        return Secondary99;
    }

    /* renamed from: getTertiary0-0d7_KjU, reason: not valid java name */
    public final long m2333getTertiary00d7_KjU() {
        return Tertiary0;
    }

    /* renamed from: getTertiary10-0d7_KjU, reason: not valid java name */
    public final long m2334getTertiary100d7_KjU() {
        return Tertiary10;
    }

    /* renamed from: getTertiary100-0d7_KjU, reason: not valid java name */
    public final long m2335getTertiary1000d7_KjU() {
        return Tertiary100;
    }

    /* renamed from: getTertiary20-0d7_KjU, reason: not valid java name */
    public final long m2336getTertiary200d7_KjU() {
        return Tertiary20;
    }

    /* renamed from: getTertiary30-0d7_KjU, reason: not valid java name */
    public final long m2337getTertiary300d7_KjU() {
        return Tertiary30;
    }

    /* renamed from: getTertiary40-0d7_KjU, reason: not valid java name */
    public final long m2338getTertiary400d7_KjU() {
        return Tertiary40;
    }

    /* renamed from: getTertiary50-0d7_KjU, reason: not valid java name */
    public final long m2339getTertiary500d7_KjU() {
        return Tertiary50;
    }

    /* renamed from: getTertiary60-0d7_KjU, reason: not valid java name */
    public final long m2340getTertiary600d7_KjU() {
        return Tertiary60;
    }

    /* renamed from: getTertiary70-0d7_KjU, reason: not valid java name */
    public final long m2341getTertiary700d7_KjU() {
        return Tertiary70;
    }

    /* renamed from: getTertiary80-0d7_KjU, reason: not valid java name */
    public final long m2342getTertiary800d7_KjU() {
        return Tertiary80;
    }

    /* renamed from: getTertiary90-0d7_KjU, reason: not valid java name */
    public final long m2343getTertiary900d7_KjU() {
        return Tertiary90;
    }

    /* renamed from: getTertiary95-0d7_KjU, reason: not valid java name */
    public final long m2344getTertiary950d7_KjU() {
        return Tertiary95;
    }

    /* renamed from: getTertiary99-0d7_KjU, reason: not valid java name */
    public final long m2345getTertiary990d7_KjU() {
        return Tertiary99;
    }

    /* renamed from: getWhite-0d7_KjU, reason: not valid java name */
    public final long m2346getWhite0d7_KjU() {
        return White;
    }
}
