package R6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes5.dex */
public class r0 extends AbstractC1352t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(boolean z8, int i8, byte[] bArr) {
        super(z8, i8, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // R6.AbstractC1351s
    public void p(C1350q c1350q, boolean z8) {
        int i8;
        if (this.f8848a) {
            i8 = 224;
        } else {
            i8 = PsExtractor.AUDIO_STREAM;
        }
        c1350q.m(z8, i8, this.f8849b, this.f8850c);
    }
}
