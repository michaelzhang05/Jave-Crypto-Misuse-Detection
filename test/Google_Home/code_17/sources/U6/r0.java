package U6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes5.dex */
public class r0 extends AbstractC1461t {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(boolean z8, int i8, byte[] bArr) {
        super(z8, i8, bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // U6.AbstractC1460s
    public void m(C1459q c1459q, boolean z8) {
        int i8;
        if (this.f10474a) {
            i8 = 224;
        } else {
            i8 = PsExtractor.AUDIO_STREAM;
        }
        c1459q.m(z8, i8, this.f10475b, this.f10476c);
    }
}
