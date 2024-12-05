package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class Utf8 {
    private static Utf8 DEFAULT;

    /* loaded from: classes3.dex */
    static class DecodeUtil {
        DecodeUtil() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleFourBytes(byte b8, byte b9, byte b10, byte b11, char[] cArr, int i8) throws IllegalArgumentException {
            if (!isNotTrailingByte(b9) && (((b8 << 28) + (b9 + 112)) >> 30) == 0 && !isNotTrailingByte(b10) && !isNotTrailingByte(b11)) {
                int trailingByteValue = ((b8 & 7) << 18) | (trailingByteValue(b9) << 12) | (trailingByteValue(b10) << 6) | trailingByteValue(b11);
                cArr[i8] = highSurrogate(trailingByteValue);
                cArr[i8 + 1] = lowSurrogate(trailingByteValue);
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleOneByte(byte b8, char[] cArr, int i8) {
            cArr[i8] = (char) b8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleThreeBytes(byte b8, byte b9, byte b10, char[] cArr, int i8) throws IllegalArgumentException {
            if (!isNotTrailingByte(b9) && ((b8 != -32 || b9 >= -96) && ((b8 != -19 || b9 < -96) && !isNotTrailingByte(b10)))) {
                cArr[i8] = (char) (((b8 & 15) << 12) | (trailingByteValue(b9) << 6) | trailingByteValue(b10));
                return;
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void handleTwoBytes(byte b8, byte b9, char[] cArr, int i8) throws IllegalArgumentException {
            if (b8 >= -62) {
                if (!isNotTrailingByte(b9)) {
                    cArr[i8] = (char) (((b8 & 31) << 6) | trailingByteValue(b9));
                    return;
                }
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        }

        private static char highSurrogate(int i8) {
            return (char) ((i8 >>> 10) + 55232);
        }

        private static boolean isNotTrailingByte(byte b8) {
            return b8 > -65;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isOneByte(byte b8) {
            return b8 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isThreeBytes(byte b8) {
            return b8 < -16;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean isTwoBytes(byte b8) {
            return b8 < -32;
        }

        private static char lowSurrogate(int i8) {
            return (char) ((i8 & 1023) + 56320);
        }

        private static int trailingByteValue(byte b8) {
            return b8 & 63;
        }
    }

    /* loaded from: classes3.dex */
    static class UnpairedSurrogateException extends IllegalArgumentException {
        UnpairedSurrogateException(int i8, int i9) {
            super("Unpaired surrogate at index " + i8 + " of " + i9);
        }
    }

    public static Utf8 getDefault() {
        if (DEFAULT == null) {
            DEFAULT = new Utf8Safe();
        }
        return DEFAULT;
    }

    public static void setDefault(Utf8 utf8) {
        DEFAULT = utf8;
    }

    public abstract String decodeUtf8(ByteBuffer byteBuffer, int i8, int i9);

    public abstract void encodeUtf8(CharSequence charSequence, ByteBuffer byteBuffer);

    public abstract int encodedLength(CharSequence charSequence);
}
