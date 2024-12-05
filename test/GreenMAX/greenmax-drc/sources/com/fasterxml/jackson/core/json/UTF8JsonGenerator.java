package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import okhttp3.internal.http2.Settings;

/* loaded from: classes.dex */
public class UTF8JsonGenerator extends JsonGeneratorImpl {
    protected boolean _bufferRecyclable;
    protected char[] _charBuffer;
    protected final int _charBufferLength;
    protected byte[] _outputBuffer;
    protected final int _outputEnd;
    protected final int _outputMaxContiguous;
    protected final OutputStream _outputStream;
    protected int _outputTail;
    protected byte _quoteChar;
    private static final byte[] HEX_CHARS = CharTypes.copyHexBytes();
    private static final byte[] NULL_BYTES = {110, 117, 108, 108};
    private static final byte[] TRUE_BYTES = {116, 114, 117, 101};
    private static final byte[] FALSE_BYTES = {102, 97, 108, 115, 101};

    public UTF8JsonGenerator(IOContext iOContext, int i2, ObjectCodec objectCodec, OutputStream outputStream) {
        super(iOContext, i2, objectCodec);
        this._quoteChar = (byte) 34;
        this._outputStream = outputStream;
        this._bufferRecyclable = true;
        byte[] allocWriteEncodingBuffer = iOContext.allocWriteEncodingBuffer();
        this._outputBuffer = allocWriteEncodingBuffer;
        int length = allocWriteEncodingBuffer.length;
        this._outputEnd = length;
        this._outputMaxContiguous = length >> 3;
        char[] allocConcatBuffer = iOContext.allocConcatBuffer();
        this._charBuffer = allocConcatBuffer;
        this._charBufferLength = allocConcatBuffer.length;
        if (isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)) {
            setHighestNonEscapedChar(127);
        }
    }

    private final int _outputMultiByteChar(int i2, int i3) throws IOException {
        byte[] bArr = this._outputBuffer;
        if (i2 >= 55296 && i2 <= 57343) {
            int i4 = i3 + 1;
            bArr[i3] = 92;
            int i5 = i4 + 1;
            bArr[i4] = 117;
            int i6 = i5 + 1;
            byte[] bArr2 = HEX_CHARS;
            bArr[i5] = bArr2[(i2 >> 12) & 15];
            int i7 = i6 + 1;
            bArr[i6] = bArr2[(i2 >> 8) & 15];
            int i8 = i7 + 1;
            bArr[i7] = bArr2[(i2 >> 4) & 15];
            int i9 = i8 + 1;
            bArr[i8] = bArr2[i2 & 15];
            return i9;
        }
        int i10 = i3 + 1;
        bArr[i3] = (byte) ((i2 >> 12) | 224);
        int i11 = i10 + 1;
        bArr[i10] = (byte) (((i2 >> 6) & 63) | 128);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i2 & 63) | 128);
        return i12;
    }

    private final int _outputRawMultiByteChar(int i2, char[] cArr, int i3, int i4) throws IOException {
        if (i2 >= 55296 && i2 <= 57343) {
            if (i3 >= i4 || cArr == null) {
                _reportError(String.format("Split surrogate on writeRaw() input (last character): first character 0x%4x", Integer.valueOf(i2)));
            }
            _outputSurrogates(i2, cArr[i3]);
            return i3 + 1;
        }
        byte[] bArr = this._outputBuffer;
        int i5 = this._outputTail;
        int i6 = i5 + 1;
        this._outputTail = i6;
        bArr[i5] = (byte) ((i2 >> 12) | 224);
        int i7 = i6 + 1;
        this._outputTail = i7;
        bArr[i6] = (byte) (((i2 >> 6) & 63) | 128);
        this._outputTail = i7 + 1;
        bArr[i7] = (byte) ((i2 & 63) | 128);
        return i3;
    }

    private final int _readMore(InputStream inputStream, byte[] bArr, int i2, int i3, int i4) throws IOException {
        int i5 = 0;
        while (i2 < i3) {
            bArr[i5] = bArr[i2];
            i5++;
            i2++;
        }
        int min = Math.min(i4, bArr.length);
        do {
            int i6 = min - i5;
            if (i6 == 0) {
                break;
            }
            int read = inputStream.read(bArr, i5, i6);
            if (read < 0) {
                return i5;
            }
            i5 += read;
        } while (i5 < 3);
        return i5;
    }

    private final void _writeBytes(byte[] bArr) throws IOException {
        int length = bArr.length;
        if (this._outputTail + length > this._outputEnd) {
            _flushBuffer();
            if (length > 512) {
                this._outputStream.write(bArr, 0, length);
                return;
            }
        }
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    private final void _writeCustomStringSegment2(char[] cArr, int i2, int i3) throws IOException {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        if (i5 <= 0) {
            i5 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        while (i2 < i3) {
            int i6 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= 127) {
                if (iArr[c2] == 0) {
                    bArr[i4] = (byte) c2;
                    i2 = i6;
                    i4++;
                } else {
                    int i7 = iArr[c2];
                    if (i7 > 0) {
                        int i8 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 != -2) {
                        i4 = _writeGenericEscape(c2, i4);
                    } else {
                        throw null;
                    }
                }
            } else if (c2 > i5) {
                i4 = _writeGenericEscape(c2, i4);
            } else {
                throw null;
            }
            i2 = i6;
        }
        this._outputTail = i4;
    }

    private int _writeGenericEscape(int i2, int i3) throws IOException {
        int i4;
        byte[] bArr = this._outputBuffer;
        int i5 = i3 + 1;
        bArr[i3] = 92;
        int i6 = i5 + 1;
        bArr[i5] = 117;
        if (i2 > 255) {
            int i7 = 255 & (i2 >> 8);
            int i8 = i6 + 1;
            byte[] bArr2 = HEX_CHARS;
            bArr[i6] = bArr2[i7 >> 4];
            i4 = i8 + 1;
            bArr[i8] = bArr2[i7 & 15];
            i2 &= 255;
        } else {
            int i9 = i6 + 1;
            bArr[i6] = 48;
            i4 = i9 + 1;
            bArr[i9] = 48;
        }
        int i10 = i4 + 1;
        byte[] bArr3 = HEX_CHARS;
        bArr[i4] = bArr3[i2 >> 4];
        int i11 = i10 + 1;
        bArr[i10] = bArr3[i2 & 15];
        return i11;
    }

    private final void _writeNull() throws IOException {
        if (this._outputTail + 4 >= this._outputEnd) {
            _flushBuffer();
        }
        System.arraycopy(NULL_BYTES, 0, this._outputBuffer, this._outputTail, 4);
        this._outputTail += 4;
    }

    private final void _writeQuotedInt(int i2) throws IOException {
        if (this._outputTail + 13 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr[i3] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(i2, bArr, i4);
        this._outputTail = outputInt;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    private final void _writeQuotedLong(long j2) throws IOException {
        if (this._outputTail + 23 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int outputLong = NumberOutput.outputLong(j2, bArr, i3);
        this._outputTail = outputLong;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputLong + 1;
        bArr2[outputLong] = this._quoteChar;
    }

    private final void _writeQuotedRaw(String str) throws IOException {
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        writeRaw(str);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    private final void _writeQuotedShort(short s) throws IOException {
        if (this._outputTail + 8 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int outputInt = NumberOutput.outputInt(s, bArr, i3);
        this._outputTail = outputInt;
        byte[] bArr2 = this._outputBuffer;
        this._outputTail = outputInt + 1;
        bArr2[outputInt] = this._quoteChar;
    }

    private void _writeRawSegment(char[] cArr, int i2, int i3) throws IOException {
        while (i2 < i3) {
            do {
                char c2 = cArr[i2];
                if (c2 > 127) {
                    int i4 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 < 2048) {
                        byte[] bArr = this._outputBuffer;
                        int i5 = this._outputTail;
                        int i6 = i5 + 1;
                        this._outputTail = i6;
                        bArr[i5] = (byte) ((c3 >> 6) | 192);
                        this._outputTail = i6 + 1;
                        bArr[i6] = (byte) ((c3 & '?') | 128);
                        i2 = i4;
                    } else {
                        i2 = _outputRawMultiByteChar(c3, cArr, i4, i3);
                    }
                } else {
                    byte[] bArr2 = this._outputBuffer;
                    int i7 = this._outputTail;
                    this._outputTail = i7 + 1;
                    bArr2[i7] = (byte) c2;
                    i2++;
                }
            } while (i2 < i3);
            return;
        }
    }

    private final void _writeSegmentedRaw(char[] cArr, int i2, int i3) throws IOException {
        int i4 = this._outputEnd;
        byte[] bArr = this._outputBuffer;
        int i5 = i3 + i2;
        while (i2 < i5) {
            do {
                char c2 = cArr[i2];
                if (c2 >= 128) {
                    if (this._outputTail + 3 >= this._outputEnd) {
                        _flushBuffer();
                    }
                    int i6 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 < 2048) {
                        int i7 = this._outputTail;
                        int i8 = i7 + 1;
                        this._outputTail = i8;
                        bArr[i7] = (byte) ((c3 >> 6) | 192);
                        this._outputTail = i8 + 1;
                        bArr[i8] = (byte) ((c3 & '?') | 128);
                        i2 = i6;
                    } else {
                        i2 = _outputRawMultiByteChar(c3, cArr, i6, i5);
                    }
                } else {
                    if (this._outputTail >= i4) {
                        _flushBuffer();
                    }
                    int i9 = this._outputTail;
                    this._outputTail = i9 + 1;
                    bArr[i9] = (byte) c2;
                    i2++;
                }
            } while (i2 < i5);
            return;
        }
    }

    private final void _writeStringSegment(char[] cArr, int i2, int i3) throws IOException {
        int i4 = i3 + i2;
        int i5 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i4) {
            char c2 = cArr[i2];
            if (c2 > 127 || iArr[c2] != 0) {
                break;
            }
            bArr[i5] = (byte) c2;
            i2++;
            i5++;
        }
        this._outputTail = i5;
        if (i2 < i4) {
            if (this._characterEscapes != null) {
                _writeCustomStringSegment2(cArr, i2, i4);
            } else if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(cArr, i2, i4);
            } else {
                _writeStringSegmentASCII2(cArr, i2, i4);
            }
        }
    }

    private final void _writeStringSegment2(char[] cArr, int i2, int i3) throws IOException {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= 127) {
                if (iArr[c2] == 0) {
                    bArr[i4] = (byte) c2;
                    i2 = i5;
                    i4++;
                } else {
                    int i6 = iArr[c2];
                    if (i6 > 0) {
                        int i7 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i4 = _writeGenericEscape(c2, i4);
                    }
                }
            } else if (c2 <= 2047) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) ((c2 >> 6) | 192);
                i4 = i8 + 1;
                bArr[i8] = (byte) ((c2 & '?') | 128);
            } else {
                i4 = _outputMultiByteChar(c2, i4);
            }
            i2 = i5;
        }
        this._outputTail = i4;
    }

    private final void _writeStringSegmentASCII2(char[] cArr, int i2, int i3) throws IOException {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        while (i2 < i3) {
            int i6 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= 127) {
                if (iArr[c2] == 0) {
                    bArr[i4] = (byte) c2;
                    i2 = i6;
                    i4++;
                } else {
                    int i7 = iArr[c2];
                    if (i7 > 0) {
                        int i8 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i4 = _writeGenericEscape(c2, i4);
                    }
                }
            } else if (c2 > i5) {
                i4 = _writeGenericEscape(c2, i4);
            } else if (c2 <= 2047) {
                int i9 = i4 + 1;
                bArr[i4] = (byte) ((c2 >> 6) | 192);
                i4 = i9 + 1;
                bArr[i9] = (byte) ((c2 & '?') | 128);
            } else {
                i4 = _outputMultiByteChar(c2, i4);
            }
            i2 = i6;
        }
        this._outputTail = i4;
    }

    private final void _writeStringSegments(String str, boolean z) throws IOException {
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = this._quoteChar;
        }
        int length = str.length();
        int i3 = 0;
        while (length > 0) {
            int min = Math.min(this._outputMaxContiguous, length);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i3, min);
            i3 += min;
            length -= min;
        }
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr2[i4] = this._quoteChar;
        }
    }

    private final void _writeUnq(SerializableString serializableString) throws IOException {
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(this._outputBuffer, this._outputTail);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
    }

    protected final void _flushBuffer() throws IOException {
        int i2 = this._outputTail;
        if (i2 > 0) {
            this._outputTail = 0;
            this._outputStream.write(this._outputBuffer, 0, i2);
        }
    }

    protected final void _outputSurrogates(int i2, int i3) throws IOException {
        int _decodeSurrogate = _decodeSurrogate(i2, i3);
        if (this._outputTail + 4 > this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i4 = this._outputTail;
        int i5 = i4 + 1;
        this._outputTail = i5;
        bArr[i4] = (byte) ((_decodeSurrogate >> 18) | 240);
        int i6 = i5 + 1;
        this._outputTail = i6;
        bArr[i5] = (byte) (((_decodeSurrogate >> 12) & 63) | 128);
        int i7 = i6 + 1;
        this._outputTail = i7;
        bArr[i6] = (byte) (((_decodeSurrogate >> 6) & 63) | 128);
        this._outputTail = i7 + 1;
        bArr[i7] = (byte) ((_decodeSurrogate & 63) | 128);
    }

    protected void _releaseBuffers() {
        byte[] bArr = this._outputBuffer;
        if (bArr != null && this._bufferRecyclable) {
            this._outputBuffer = null;
            this._ioContext.releaseWriteEncodingBuffer(bArr);
        }
        char[] cArr = this._charBuffer;
        if (cArr != null) {
            this._charBuffer = null;
            this._ioContext.releaseConcatBuffer(cArr);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    protected final void _verifyValueWrite(String str) throws IOException {
        byte b2;
        int writeValue = this._writeContext.writeValue();
        if (this._cfgPrettyPrinter != null) {
            _verifyPrettyValueWrite(str, writeValue);
            return;
        }
        if (writeValue == 1) {
            b2 = 44;
        } else {
            if (writeValue != 2) {
                if (writeValue != 3) {
                    if (writeValue != 5) {
                        return;
                    }
                    _reportCantWriteValueExpectName(str);
                    return;
                }
                SerializableString serializableString = this._rootValueSeparator;
                if (serializableString != null) {
                    byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
                    if (asUnquotedUTF8.length > 0) {
                        _writeBytes(asUnquotedUTF8);
                        return;
                    }
                    return;
                }
                return;
            }
            b2 = 58;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = b2;
    }

    protected final void _writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException, JsonGenerationException {
        int i4 = i3 - 3;
        int i5 = this._outputEnd - 6;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        while (i2 <= i4) {
            if (this._outputTail > i5) {
                _flushBuffer();
            }
            int i6 = i2 + 1;
            int i7 = i6 + 1;
            int i8 = ((bArr[i2] << 8) | (bArr[i6] & 255)) << 8;
            int i9 = i7 + 1;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk(i8 | (bArr[i7] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i10 = encodeBase64Chunk + 1;
                this._outputTail = i10;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = i10 + 1;
                bArr2[i10] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
            i2 = i9;
        }
        int i11 = i3 - i2;
        if (i11 > 0) {
            if (this._outputTail > i5) {
                _flushBuffer();
            }
            int i12 = i2 + 1;
            int i13 = bArr[i2] << 16;
            if (i11 == 2) {
                i13 |= (bArr[i12] & 255) << 8;
            }
            this._outputTail = base64Variant.encodeBase64Partial(i13, i11, this._outputBuffer, this._outputTail);
        }
    }

    protected final void _writePPFieldName(String str) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        str.getChars(0, length, this._charBuffer, 0);
        if (length <= this._outputMaxContiguous) {
            if (this._outputTail + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(this._charBuffer, 0, length);
        } else {
            _writeStringSegments(this._charBuffer, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        if (this._outputBuffer != null && isEnabled(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                JsonStreamContext outputContext = getOutputContext();
                if (outputContext.inArray()) {
                    writeEndArray();
                } else if (!outputContext.inObject()) {
                    break;
                } else {
                    writeEndObject();
                }
            }
        }
        _flushBuffer();
        this._outputTail = 0;
        if (this._outputStream != null) {
            if (!this._ioContext.isResourceManaged() && !isEnabled(JsonGenerator.Feature.AUTO_CLOSE_TARGET)) {
                if (isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
                    this._outputStream.flush();
                }
            } else {
                this._outputStream.close();
            }
        }
        _releaseBuffers();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator, java.io.Flushable
    public void flush() throws IOException {
        _flushBuffer();
        if (this._outputStream == null || !isEnabled(JsonGenerator.Feature.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this._outputStream.flush();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i2, int i3) throws IOException, JsonGenerationException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
        _writeBinary(base64Variant, bArr, i2, i3 + i2);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeBoolean(boolean z) throws IOException {
        _verifyValueWrite("write a boolean value");
        if (this._outputTail + 5 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = z ? TRUE_BYTES : FALSE_BYTES;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this._outputBuffer, this._outputTail, length);
        this._outputTail += length;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndArray() throws IOException {
        if (!this._writeContext.inArray()) {
            _reportError("Current context not Array but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndArray(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = 93;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeEndObject() throws IOException {
        if (!this._writeContext.inObject()) {
            _reportError("Current context not Object but " + this._writeContext.typeDesc());
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeEndObject(this, this._writeContext.getEntryCount());
        } else {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = 125;
        }
        this._writeContext = this._writeContext.clearAndGetParent();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(String str) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(str);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(str);
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = 44;
        }
        if (this._cfgUnqNames) {
            _writeStringSegments(str, false);
            return;
        }
        int length = str.length();
        if (length > this._charBufferLength) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr2[i3] = this._quoteChar;
        if (length <= this._outputMaxContiguous) {
            if (i4 + length > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, 0, length);
        } else {
            _writeStringSegments(str, 0, length);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNull() throws IOException {
        _verifyValueWrite("write a null");
        _writeNull();
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(short s) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 6 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedShort(s);
        } else {
            this._outputTail = NumberOutput.outputInt(s, this._outputBuffer, this._outputTail);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(String str) throws IOException {
        int length = str.length();
        char[] cArr = this._charBuffer;
        if (length <= cArr.length) {
            str.getChars(0, length, cArr, 0);
            writeRaw(cArr, 0, length);
        } else {
            writeRaw(str, 0, length);
        }
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase, com.fasterxml.jackson.core.JsonGenerator
    public void writeRawValue(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a raw (unencoded) value");
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartArray() throws IOException {
        _verifyValueWrite("start an array");
        this._writeContext = this._writeContext.createChildArrayContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartArray(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 91;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeStartObject() throws IOException {
        _verifyValueWrite("start an object");
        this._writeContext = this._writeContext.createChildObjectContext();
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(String str) throws IOException {
        _verifyValueWrite("write a string");
        if (str == null) {
            _writeNull();
            return;
        }
        int length = str.length();
        if (length > this._outputMaxContiguous) {
            _writeStringSegments(str, true);
            return;
        }
        if (this._outputTail + length >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = this._quoteChar;
        _writeStringSegment(str, 0, length);
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr2[i3] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(int i2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._outputTail + 11 >= this._outputEnd) {
            _flushBuffer();
        }
        if (this._cfgNumbersAsStrings) {
            _writeQuotedInt(i2);
        } else {
            this._outputTail = NumberOutput.outputInt(i2, this._outputBuffer, this._outputTail);
        }
    }

    public void writeRaw(String str, int i2, int i3) throws IOException {
        char c2;
        char[] cArr = this._charBuffer;
        if (i3 <= cArr.length) {
            str.getChars(i2, i2 + i3, cArr, 0);
            writeRaw(cArr, 0, i3);
            return;
        }
        int i4 = this._outputEnd;
        int i5 = (i4 >> 2) + (i4 >> 4);
        int i6 = i5 * 3;
        while (i3 > 0) {
            int min = Math.min(i5, i3);
            str.getChars(i2, i2 + min, cArr, 0);
            if (this._outputTail + i6 > this._outputEnd) {
                _flushBuffer();
            }
            if (i3 > 0 && (c2 = cArr[min - 1]) >= 55296 && c2 <= 56319) {
                min--;
            }
            _writeRawSegment(cArr, 0, min);
            i2 += min;
            i3 -= min;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeStartObject(Object obj) throws IOException {
        _verifyValueWrite("start an object");
        JsonWriteContext createChildObjectContext = this._writeContext.createChildObjectContext();
        this._writeContext = createChildObjectContext;
        if (obj != null) {
            createChildObjectContext.setCurrentValue(obj);
        }
        PrettyPrinter prettyPrinter = this._cfgPrettyPrinter;
        if (prettyPrinter != null) {
            prettyPrinter.writeStartObject(this);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        this._outputTail = i2 + 1;
        bArr[i2] = 123;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i2) throws IOException, JsonGenerationException {
        _verifyValueWrite("write a binary value");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i3 = this._outputTail;
        this._outputTail = i3 + 1;
        bArr[i3] = this._quoteChar;
        byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            if (i2 < 0) {
                i2 = _writeBinary(base64Variant, inputStream, allocBase64Buffer);
            } else {
                int _writeBinary = _writeBinary(base64Variant, inputStream, allocBase64Buffer, i2);
                if (_writeBinary > 0) {
                    _reportError("Too few bytes available: missing " + _writeBinary + " bytes (out of " + i2 + ")");
                }
            }
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i4 = this._outputTail;
            this._outputTail = i4 + 1;
            bArr2[i4] = this._quoteChar;
            return i2;
        } catch (Throwable th) {
            this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            throw th;
        }
    }

    private final void _writeStringSegments(char[] cArr, int i2, int i3) throws IOException {
        do {
            int min = Math.min(this._outputMaxContiguous, i3);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i2, min);
            i2 += min;
            i3 -= min;
        } while (i3 > 0);
    }

    private final void _writeStringSegment(String str, int i2, int i3) throws IOException {
        int i4 = i3 + i2;
        int i5 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i4) {
            char charAt = str.charAt(i2);
            if (charAt > 127 || iArr[charAt] != 0) {
                break;
            }
            bArr[i5] = (byte) charAt;
            i2++;
            i5++;
        }
        this._outputTail = i5;
        if (i2 < i4) {
            if (this._characterEscapes != null) {
                _writeCustomStringSegment2(str, i2, i4);
            } else if (this._maximumNonEscapedChar == 0) {
                _writeStringSegment2(str, i2, i4);
            } else {
                _writeStringSegmentASCII2(str, i2, i4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(long j2) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedLong(j2);
            return;
        }
        if (this._outputTail + 21 >= this._outputEnd) {
            _flushBuffer();
        }
        this._outputTail = NumberOutput.outputLong(j2, this._outputBuffer, this._outputTail);
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeString(char[] cArr, int i2, int i3) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i4 = this._outputTail;
        int i5 = i4 + 1;
        this._outputTail = i5;
        bArr[i4] = this._quoteChar;
        if (i3 <= this._outputMaxContiguous) {
            if (i5 + i3 > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(cArr, i2, i3);
        } else {
            _writeStringSegments(cArr, i2, i3);
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i6 = this._outputTail;
        this._outputTail = i6 + 1;
        bArr2[i6] = this._quoteChar;
    }

    private final void _writeStringSegments(String str, int i2, int i3) throws IOException {
        do {
            int min = Math.min(this._outputMaxContiguous, i3);
            if (this._outputTail + min > this._outputEnd) {
                _flushBuffer();
            }
            _writeStringSegment(str, i2, min);
            i2 += min;
            i3 -= min;
        } while (i3 > 0);
    }

    private final void _writeStringSegment2(String str, int i2, int i3) throws IOException {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        while (i2 < i3) {
            int i5 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    bArr[i4] = (byte) charAt;
                    i2 = i5;
                    i4++;
                } else {
                    int i6 = iArr[charAt];
                    if (i6 > 0) {
                        int i7 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i7 + 1;
                        bArr[i7] = (byte) i6;
                    } else {
                        i4 = _writeGenericEscape(charAt, i4);
                    }
                }
            } else if (charAt <= 2047) {
                int i8 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 6) | 192);
                i4 = i8 + 1;
                bArr[i8] = (byte) ((charAt & '?') | 128);
            } else {
                i4 = _outputMultiByteChar(charAt, i4);
            }
            i2 = i5;
        }
        this._outputTail = i4;
    }

    protected final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr, int i2) throws IOException, JsonGenerationException {
        int _readMore;
        int i3 = this._outputEnd - 6;
        int i4 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i5 = -3;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i2 <= 2) {
                break;
            }
            if (i6 > i5) {
                i7 = _readMore(inputStream, bArr, i6, i7, i2);
                if (i7 < 3) {
                    i6 = 0;
                    break;
                }
                i5 = i7 - 3;
                i6 = 0;
            }
            if (this._outputTail > i3) {
                _flushBuffer();
            }
            int i8 = i6 + 1;
            int i9 = bArr[i6] << 8;
            int i10 = i8 + 1;
            i6 = i10 + 1;
            i2 -= 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i8] & 255) | i9) << 8) | (bArr[i10] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i11 = encodeBase64Chunk + 1;
                this._outputTail = i11;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = i11 + 1;
                bArr2[i11] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i2 <= 0 || (_readMore = _readMore(inputStream, bArr, i6, i7, i2)) <= 0) {
            return i2;
        }
        if (this._outputTail > i3) {
            _flushBuffer();
        }
        int i12 = bArr[0] << 16;
        if (1 < _readMore) {
            i12 |= (bArr[1] & 255) << 8;
        } else {
            i4 = 1;
        }
        this._outputTail = base64Variant.encodeBase64Partial(i12, i4, this._outputBuffer, this._outputTail);
        return i2 - i4;
    }

    private final void _writeCustomStringSegment2(String str, int i2, int i3) throws IOException {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        if (i5 <= 0) {
            i5 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        }
        while (i2 < i3) {
            int i6 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    bArr[i4] = (byte) charAt;
                    i2 = i6;
                    i4++;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else if (i7 != -2) {
                        i4 = _writeGenericEscape(charAt, i4);
                    } else {
                        throw null;
                    }
                }
            } else if (charAt > i5) {
                i4 = _writeGenericEscape(charAt, i4);
            } else {
                throw null;
            }
            i2 = i6;
        }
        this._outputTail = i4;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(SerializableString serializableString) throws IOException {
        byte[] asUnquotedUTF8 = serializableString.asUnquotedUTF8();
        if (asUnquotedUTF8.length > 0) {
            _writeBytes(asUnquotedUTF8);
        }
    }

    private final void _writeStringSegmentASCII2(String str, int i2, int i3) throws IOException {
        if (this._outputTail + ((i3 - i2) * 6) > this._outputEnd) {
            _flushBuffer();
        }
        int i4 = this._outputTail;
        byte[] bArr = this._outputBuffer;
        int[] iArr = this._outputEscapes;
        int i5 = this._maximumNonEscapedChar;
        while (i2 < i3) {
            int i6 = i2 + 1;
            char charAt = str.charAt(i2);
            if (charAt <= 127) {
                if (iArr[charAt] == 0) {
                    bArr[i4] = (byte) charAt;
                    i2 = i6;
                    i4++;
                } else {
                    int i7 = iArr[charAt];
                    if (i7 > 0) {
                        int i8 = i4 + 1;
                        bArr[i4] = 92;
                        i4 = i8 + 1;
                        bArr[i8] = (byte) i7;
                    } else {
                        i4 = _writeGenericEscape(charAt, i4);
                    }
                }
            } else if (charAt > i5) {
                i4 = _writeGenericEscape(charAt, i4);
            } else if (charAt <= 2047) {
                int i9 = i4 + 1;
                bArr[i4] = (byte) ((charAt >> 6) | 192);
                i4 = i9 + 1;
                bArr[i9] = (byte) ((charAt & '?') | 128);
            } else {
                i4 = _outputMultiByteChar(charAt, i4);
            }
            i2 = i6;
        }
        this._outputTail = i4;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigInteger bigInteger) throws IOException {
        _verifyValueWrite("write a number");
        if (bigInteger == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(bigInteger.toString());
        } else {
            writeRaw(bigInteger.toString());
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeRaw(char[] cArr, int i2, int i3) throws IOException {
        int i4 = i3 + i3 + i3;
        int i5 = this._outputTail + i4;
        int i6 = this._outputEnd;
        if (i5 > i6) {
            if (i6 < i4) {
                _writeSegmentedRaw(cArr, i2, i3);
                return;
            }
            _flushBuffer();
        }
        int i7 = i3 + i2;
        while (i2 < i7) {
            do {
                char c2 = cArr[i2];
                if (c2 > 127) {
                    int i8 = i2 + 1;
                    char c3 = cArr[i2];
                    if (c3 < 2048) {
                        byte[] bArr = this._outputBuffer;
                        int i9 = this._outputTail;
                        int i10 = i9 + 1;
                        this._outputTail = i10;
                        bArr[i9] = (byte) ((c3 >> 6) | 192);
                        this._outputTail = i10 + 1;
                        bArr[i10] = (byte) ((c3 & '?') | 128);
                        i2 = i8;
                    } else {
                        i2 = _outputRawMultiByteChar(c3, cArr, i8, i7);
                    }
                } else {
                    byte[] bArr2 = this._outputBuffer;
                    int i11 = this._outputTail;
                    this._outputTail = i11 + 1;
                    bArr2[i11] = (byte) c2;
                    i2++;
                }
            } while (i2 < i7);
            return;
        }
    }

    protected final void _writePPFieldName(SerializableString serializableString) throws IOException {
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            this._cfgPrettyPrinter.writeObjectEntrySeparator(this);
        } else {
            this._cfgPrettyPrinter.beforeObjectEntries(this);
        }
        boolean z = !this._cfgUnqNames;
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = this._quoteChar;
        }
        _writeBytes(serializableString.asQuotedUTF8());
        if (z) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr2 = this._outputBuffer;
            int i3 = this._outputTail;
            this._outputTail = i3 + 1;
            bArr2[i3] = this._quoteChar;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeFieldName(SerializableString serializableString) throws IOException {
        if (this._cfgPrettyPrinter != null) {
            _writePPFieldName(serializableString);
            return;
        }
        int writeFieldName = this._writeContext.writeFieldName(serializableString.getValue());
        if (writeFieldName == 4) {
            _reportError("Can not write a field name, expecting a value");
        }
        if (writeFieldName == 1) {
            if (this._outputTail >= this._outputEnd) {
                _flushBuffer();
            }
            byte[] bArr = this._outputBuffer;
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = 44;
        }
        if (this._cfgUnqNames) {
            _writeUnq(serializableString);
            return;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i3 = this._outputTail;
        int i4 = i3 + 1;
        this._outputTail = i4;
        bArr2[i3] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr2, i4);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr3 = this._outputBuffer;
        int i5 = this._outputTail;
        this._outputTail = i5 + 1;
        bArr3[i5] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(double d2) throws IOException {
        if (!this._cfgNumbersAsStrings && ((!Double.isNaN(d2) && !Double.isInfinite(d2)) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(d2));
        } else {
            writeString(String.valueOf(d2));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void writeString(SerializableString serializableString) throws IOException {
        _verifyValueWrite("write a string");
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        int i2 = this._outputTail;
        int i3 = i2 + 1;
        this._outputTail = i3;
        bArr[i2] = this._quoteChar;
        int appendQuotedUTF8 = serializableString.appendQuotedUTF8(bArr, i3);
        if (appendQuotedUTF8 < 0) {
            _writeBytes(serializableString.asQuotedUTF8());
        } else {
            this._outputTail += appendQuotedUTF8;
        }
        if (this._outputTail >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr2 = this._outputBuffer;
        int i4 = this._outputTail;
        this._outputTail = i4 + 1;
        bArr2[i4] = this._quoteChar;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(float f2) throws IOException {
        if (!this._cfgNumbersAsStrings && ((!Float.isNaN(f2) && !Float.isInfinite(f2)) || !JsonGenerator.Feature.QUOTE_NON_NUMERIC_NUMBERS.enabledIn(this._features))) {
            _verifyValueWrite("write a number");
            writeRaw(String.valueOf(f2));
        } else {
            writeString(String.valueOf(f2));
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeRaw(char c2) throws IOException {
        if (this._outputTail + 3 >= this._outputEnd) {
            _flushBuffer();
        }
        byte[] bArr = this._outputBuffer;
        if (c2 <= 127) {
            int i2 = this._outputTail;
            this._outputTail = i2 + 1;
            bArr[i2] = (byte) c2;
        } else {
            if (c2 < 2048) {
                int i3 = this._outputTail;
                int i4 = i3 + 1;
                this._outputTail = i4;
                bArr[i3] = (byte) ((c2 >> 6) | 192);
                this._outputTail = i4 + 1;
                bArr[i4] = (byte) ((c2 & '?') | 128);
                return;
            }
            _outputRawMultiByteChar(c2, null, 0, 0);
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        _verifyValueWrite("write a number");
        if (bigDecimal == null) {
            _writeNull();
        } else if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(_asString(bigDecimal));
        } else {
            writeRaw(_asString(bigDecimal));
        }
    }

    protected final int _writeBinary(Base64Variant base64Variant, InputStream inputStream, byte[] bArr) throws IOException, JsonGenerationException {
        int i2 = this._outputEnd - 6;
        int i3 = 2;
        int maxLineLength = base64Variant.getMaxLineLength() >> 2;
        int i4 = -3;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i5 > i4) {
                i6 = _readMore(inputStream, bArr, i5, i6, bArr.length);
                if (i6 < 3) {
                    break;
                }
                i4 = i6 - 3;
                i5 = 0;
            }
            if (this._outputTail > i2) {
                _flushBuffer();
            }
            int i8 = i5 + 1;
            int i9 = bArr[i5] << 8;
            int i10 = i8 + 1;
            i5 = i10 + 1;
            i7 += 3;
            int encodeBase64Chunk = base64Variant.encodeBase64Chunk((((bArr[i8] & 255) | i9) << 8) | (bArr[i10] & 255), this._outputBuffer, this._outputTail);
            this._outputTail = encodeBase64Chunk;
            maxLineLength--;
            if (maxLineLength <= 0) {
                byte[] bArr2 = this._outputBuffer;
                int i11 = encodeBase64Chunk + 1;
                this._outputTail = i11;
                bArr2[encodeBase64Chunk] = 92;
                this._outputTail = i11 + 1;
                bArr2[i11] = 110;
                maxLineLength = base64Variant.getMaxLineLength() >> 2;
            }
        }
        if (i6 <= 0) {
            return i7;
        }
        if (this._outputTail > i2) {
            _flushBuffer();
        }
        int i12 = bArr[0] << 16;
        if (1 < i6) {
            i12 |= (bArr[1] & 255) << 8;
        } else {
            i3 = 1;
        }
        int i13 = i7 + i3;
        this._outputTail = base64Variant.encodeBase64Partial(i12, i3, this._outputBuffer, this._outputTail);
        return i13;
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public void writeNumber(String str) throws IOException {
        _verifyValueWrite("write a number");
        if (this._cfgNumbersAsStrings) {
            _writeQuotedRaw(str);
        } else {
            writeRaw(str);
        }
    }
}
