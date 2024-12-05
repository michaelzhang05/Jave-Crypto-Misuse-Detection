package R6;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public class G extends AbstractC1352t {
    public G(int i8, C1337e c1337e) {
        super(true, i8, x(c1337e));
    }

    private static byte[] x(C1337e c1337e) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i8 = 0; i8 != c1337e.f(); i8++) {
            try {
                byteArrayOutputStream.write(((AbstractC1346m) c1337e.d(i8)).l("BER"));
            } catch (IOException e8) {
                throw new r("malformed object: " + e8, e8);
            }
        }
        return byteArrayOutputStream.toByteArray();
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
        c1350q.o(z8, i8, this.f8849b, this.f8850c);
    }
}
