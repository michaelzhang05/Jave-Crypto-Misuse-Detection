package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzpd {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15392b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15393c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15394d;

    /* renamed from: e, reason: collision with root package name */
    private final String f15395e;

    /* renamed from: f, reason: collision with root package name */
    private final MediaCodecInfo.CodecCapabilities f15396f;

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
    
        if ((com.google.android.gms.internal.ads.zzsy.a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzpd(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = com.google.android.gms.internal.ads.zzsk.d(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.a = r2
            r1.f15395e = r3
            r1.f15396f = r4
            r2 = 1
            r3 = 0
            if (r5 != 0) goto L2a
            if (r4 == 0) goto L2a
            int r5 = com.google.android.gms.internal.ads.zzsy.a
            r0 = 19
            if (r5 < r0) goto L25
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L25
            r5 = 1
            goto L26
        L25:
            r5 = 0
        L26:
            if (r5 == 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            r1.f15392b = r5
            r5 = 21
            if (r4 == 0) goto L44
            int r0 = com.google.android.gms.internal.ads.zzsy.a
            if (r0 < r5) goto L3f
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r1.f15393c = r0
            if (r6 != 0) goto L5e
            if (r4 == 0) goto L5d
            int r6 = com.google.android.gms.internal.ads.zzsy.a
            if (r6 < r5) goto L59
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L59
            r4 = 1
            goto L5a
        L59:
            r4 = 0
        L5a:
            if (r4 == 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            r1.f15394d = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzpd.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean):void");
    }

    public static zzpd a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new zzpd(str, str2, codecCapabilities, z, z2);
    }

    @TargetApi(21)
    private static boolean c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i2, int i3, double d2) {
        if (d2 != -1.0d && d2 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i2, i3, d2);
        }
        return videoCapabilities.isSizeSupported(i2, i3);
    }

    public static zzpd g(String str) {
        return new zzpd(str, null, null, false, false);
    }

    private final void h(String str) {
        String str2 = this.a;
        String str3 = this.f15395e;
        String str4 = zzsy.f15566e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        Log.d("MediaCodecInfo", sb.toString());
    }

    @TargetApi(21)
    public final boolean b(int i2, int i3, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15396f;
        if (codecCapabilities == null) {
            h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("sizeAndRate.vCaps");
            return false;
        }
        if (c(videoCapabilities, i2, i3, d2)) {
            return true;
        }
        if (i2 < i3 && c(videoCapabilities, i3, i2, d2)) {
            StringBuilder sb = new StringBuilder(69);
            sb.append("sizeAndRate.rotated, ");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            sb.append("x");
            sb.append(d2);
            String sb2 = sb.toString();
            String str = this.a;
            String str2 = this.f15395e;
            String str3 = zzsy.f15566e;
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 25 + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb3.append("AssumedSupport [");
            sb3.append(sb2);
            sb3.append("] [");
            sb3.append(str);
            sb3.append(", ");
            sb3.append(str2);
            sb3.append("] [");
            sb3.append(str3);
            sb3.append("]");
            Log.d("MediaCodecInfo", sb3.toString());
            return true;
        }
        StringBuilder sb4 = new StringBuilder(69);
        sb4.append("sizeAndRate.support, ");
        sb4.append(i2);
        sb4.append("x");
        sb4.append(i3);
        sb4.append("x");
        sb4.append(d2);
        h(sb4.toString());
        return false;
    }

    public final boolean d(String str) {
        String str2;
        if (str == null || this.f15395e == null) {
            return true;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            str2 = "video/avc";
        } else if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            str2 = "video/hevc";
        } else if (trim.startsWith("vp9")) {
            str2 = "video/x-vnd.on2.vp9";
        } else if (trim.startsWith("vp8")) {
            str2 = "video/x-vnd.on2.vp8";
        } else if (trim.startsWith("mp4a")) {
            str2 = "audio/mp4a-latm";
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            str2 = "audio/ac3";
        } else if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            str2 = "audio/eac3";
        } else if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            str2 = "audio/vnd.dts";
        } else if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            str2 = "audio/vnd.dts.hd";
        } else if (trim.startsWith("opus")) {
            str2 = "audio/opus";
        } else {
            str2 = trim.startsWith("vorbis") ? "audio/vorbis" : null;
        }
        if (str2 == null) {
            return true;
        }
        if (!this.f15395e.equals(str2)) {
            StringBuilder sb = new StringBuilder(str.length() + 13 + str2.length());
            sb.append("codec.mime ");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            h(sb.toString());
            return false;
        }
        Pair<Integer, Integer> c2 = zzpi.c(str);
        if (c2 == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : j()) {
            if (codecProfileLevel.profile == ((Integer) c2.first).intValue() && codecProfileLevel.level >= ((Integer) c2.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22 + str2.length());
        sb2.append("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        h(sb2.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean e(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15396f;
        if (codecCapabilities == null) {
            h("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            h("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("sampleRate.support, ");
        sb.append(i2);
        h(sb.toString());
        return false;
    }

    @TargetApi(21)
    public final boolean f(int i2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15396f;
        if (codecCapabilities == null) {
            h("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            h("channelCount.aCaps");
            return false;
        }
        if (audioCapabilities.getMaxInputChannelCount() >= i2) {
            return true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("channelCount.support, ");
        sb.append(i2);
        h(sb.toString());
        return false;
    }

    @TargetApi(21)
    public final Point i(int i2, int i3) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15396f;
        if (codecCapabilities == null) {
            h("align.caps");
            return null;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            h("align.vCaps");
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzsy.j(i2, widthAlignment) * widthAlignment, zzsy.j(i3, heightAlignment) * heightAlignment);
    }

    public final MediaCodecInfo.CodecProfileLevel[] j() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15396f;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
