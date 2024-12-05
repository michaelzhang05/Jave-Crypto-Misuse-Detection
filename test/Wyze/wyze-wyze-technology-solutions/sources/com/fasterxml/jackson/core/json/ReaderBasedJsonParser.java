package com.fasterxml.jackson.core.json;

import cm.aptoide.pt.account.AdultContentAnalytics;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;

/* loaded from: classes.dex */
public class ReaderBasedJsonParser extends ParserBase {
    protected static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();
    protected boolean _bufferRecyclable;
    protected final int _hashSeed;
    protected char[] _inputBuffer;
    protected int _nameStartCol;
    protected long _nameStartOffset;
    protected int _nameStartRow;
    protected ObjectCodec _objectCodec;
    protected Reader _reader;
    protected final CharsToNameCanonicalizer _symbols;
    protected boolean _tokenIncomplete;

    public ReaderBasedJsonParser(IOContext iOContext, int i2, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i3, int i4, boolean z) {
        super(iOContext, i2);
        this._reader = reader;
        this._inputBuffer = cArr;
        this._inputPtr = i3;
        this._inputEnd = i4;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String _handleOddName2(int r5, int r6, int[] r7) throws java.io.IOException {
        /*
            r4 = this;
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            char[] r1 = r4._inputBuffer
            int r2 = r4._inputPtr
            int r2 = r2 - r5
            r0.resetWithShared(r1, r5, r2)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.getCurrentSegment()
            com.fasterxml.jackson.core.util.TextBuffer r0 = r4._textBuffer
            int r0 = r0.getCurrentSegmentSize()
            int r1 = r7.length
        L17:
            int r2 = r4._inputPtr
            int r3 = r4._inputEnd
            if (r2 < r3) goto L24
            boolean r2 = r4._loadMore()
            if (r2 != 0) goto L24
            goto L37
        L24:
            char[] r2 = r4._inputBuffer
            int r3 = r4._inputPtr
            char r2 = r2[r3]
            if (r2 > r1) goto L31
            r3 = r7[r2]
            if (r3 == 0) goto L51
            goto L37
        L31:
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r2)
            if (r3 != 0) goto L51
        L37:
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            r5.setCurrentLength(r0)
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r7 = r5.getTextBuffer()
            int r0 = r5.getTextOffset()
            int r5 = r5.size()
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r1 = r4._symbols
            java.lang.String r5 = r1.findSymbol(r7, r0, r5, r6)
            return r5
        L51:
            int r3 = r4._inputPtr
            int r3 = r3 + 1
            r4._inputPtr = r3
            int r6 = r6 * 33
            int r6 = r6 + r2
            int r3 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r3 < r0) goto L69
            com.fasterxml.jackson.core.util.TextBuffer r5 = r4._textBuffer
            char[] r5 = r5.finishCurrentSegment()
            r0 = 0
            goto L17
        L69:
            r0 = r3
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddName2(int, int, int[]):java.lang.String");
    }

    private final void _matchFalse() throws IOException {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'a') {
                int i4 = i3 + 1;
                if (cArr[i4] == 'l') {
                    int i5 = i4 + 1;
                    if (cArr[i5] == 's') {
                        int i6 = i5 + 1;
                        if (cArr[i6] == 'e' && ((c2 = cArr[(i2 = i6 + 1)]) < '0' || c2 == ']' || c2 == '}')) {
                            this._inputPtr = i2;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken(AdultContentAnalytics.UNLOCK, 1);
    }

    private final void _matchNull() throws IOException {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'u') {
                int i4 = i3 + 1;
                if (cArr[i4] == 'l') {
                    int i5 = i4 + 1;
                    if (cArr[i5] == 'l' && ((c2 = cArr[(i2 = i5 + 1)]) < '0' || c2 == ']' || c2 == '}')) {
                        this._inputPtr = i2;
                        return;
                    }
                }
            }
        }
        _matchToken("null", 1);
    }

    private final void _matchTrue() throws IOException {
        int i2;
        char c2;
        int i3 = this._inputPtr;
        if (i3 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i3] == 'r') {
                int i4 = i3 + 1;
                if (cArr[i4] == 'u') {
                    int i5 = i4 + 1;
                    if (cArr[i5] == 'e' && ((c2 = cArr[(i2 = i5 + 1)]) < '0' || c2 == ']' || c2 == '}')) {
                        this._inputPtr = i2;
                        return;
                    }
                }
            }
        }
        _matchToken("true", 1);
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    private final JsonToken _nextTokenNotInObject(int i2) throws IOException {
        if (i2 == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i2 != 44) {
            if (i2 == 45) {
                JsonToken _parseNegNumber = _parseNegNumber();
                this._currToken = _parseNegNumber;
                return _parseNegNumber;
            }
            if (i2 == 91) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken2 = JsonToken.START_ARRAY;
                this._currToken = jsonToken2;
                return jsonToken2;
            }
            if (i2 != 93) {
                if (i2 == 102) {
                    _matchToken(AdultContentAnalytics.UNLOCK, 1);
                    JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
                    this._currToken = jsonToken3;
                    return jsonToken3;
                }
                if (i2 == 110) {
                    _matchToken("null", 1);
                    JsonToken jsonToken4 = JsonToken.VALUE_NULL;
                    this._currToken = jsonToken4;
                    return jsonToken4;
                }
                if (i2 == 116) {
                    _matchToken("true", 1);
                    JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
                    this._currToken = jsonToken5;
                    return jsonToken5;
                }
                if (i2 != 123) {
                    switch (i2) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            JsonToken _parsePosNumber = _parsePosNumber(i2);
                            this._currToken = _parsePosNumber;
                            return _parsePosNumber;
                        default:
                            JsonToken _handleOddValue = _handleOddValue(i2);
                            this._currToken = _handleOddValue;
                            return _handleOddValue;
                    }
                }
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                JsonToken jsonToken6 = JsonToken.START_OBJECT;
                this._currToken = jsonToken6;
                return jsonToken6;
            }
        }
        if (isEnabled(JsonParser.Feature.ALLOW_MISSING_VALUES)) {
            this._inputPtr--;
            JsonToken jsonToken7 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken7;
            return jsonToken7;
        }
        JsonToken _handleOddValue2 = _handleOddValue(i2);
        this._currToken = _handleOddValue2;
        return _handleOddValue2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v12 ??, r9v5 ??, r9v3 ??, r9v9 ??, r9v7 ??, r9v10 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x006e -> B:32:0x0050). Please report as a decompilation issue!!! */
    private final com.fasterxml.jackson.core.JsonToken _parseFloat(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v18 ??, r9v12 ??, r9v5 ??, r9v3 ??, r9v9 ??, r9v7 ??, r9v10 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    private String _parseName2(int i2, int i3, int i4) throws IOException {
        this._textBuffer.resetWithShared(this._inputBuffer, i2, this._inputPtr - i2);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c2 = cArr[i5];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    c2 = _decodeEscaped();
                } else if (c2 <= i4) {
                    if (c2 == i4) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i3);
                    }
                    if (c2 < ' ') {
                        _throwUnquotedSpace(c2, "name");
                    }
                }
            }
            i3 = (i3 * 33) + c2;
            int i6 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c2;
            if (i6 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i6;
            }
        }
    }

    private final JsonToken _parseNumber2(boolean z, int i2) throws IOException {
        int i3;
        char nextChar;
        boolean z2;
        int i4;
        char nextChar2;
        if (z) {
            i2++;
        }
        this._inputPtr = i2;
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i5 = 0;
        if (z) {
            emptyAndGetCurrentSegment[0] = '-';
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i6 = this._inputPtr;
        if (i6 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i6 + 1;
            nextChar = cArr[i6];
        } else {
            nextChar = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (nextChar == '0') {
            nextChar = _verifyNoLeadingZeroes();
        }
        int i7 = 0;
        while (nextChar >= '0' && nextChar <= '9') {
            i7++;
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i8 = i3 + 1;
            emptyAndGetCurrentSegment[i3] = nextChar;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                i3 = i8;
                nextChar = 0;
                z2 = true;
                break;
            }
            char[] cArr2 = this._inputBuffer;
            int i9 = this._inputPtr;
            this._inputPtr = i9 + 1;
            nextChar = cArr2[i9];
            i3 = i8;
        }
        z2 = false;
        if (i7 == 0) {
            return _handleInvalidNumberStart(nextChar, z);
        }
        if (nextChar == '.') {
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            emptyAndGetCurrentSegment[i3] = nextChar;
            i3++;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i10 = this._inputPtr;
                this._inputPtr = i10 + 1;
                nextChar = cArr3[i10];
                if (nextChar < '0' || nextChar > '9') {
                    break;
                }
                i4++;
                if (i3 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i3 = 0;
                }
                emptyAndGetCurrentSegment[i3] = nextChar;
                i3++;
            }
            if (i4 == 0) {
                reportUnexpectedNumberChar(nextChar, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
        }
        if (nextChar == 'e' || nextChar == 'E') {
            if (i3 >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i3 = 0;
            }
            int i11 = i3 + 1;
            emptyAndGetCurrentSegment[i3] = nextChar;
            int i12 = this._inputPtr;
            if (i12 < this._inputEnd) {
                char[] cArr4 = this._inputBuffer;
                this._inputPtr = i12 + 1;
                nextChar2 = cArr4[i12];
            } else {
                nextChar2 = getNextChar("expected a digit for number exponent");
            }
            if (nextChar2 == '-' || nextChar2 == '+') {
                if (i11 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                int i13 = i11 + 1;
                emptyAndGetCurrentSegment[i11] = nextChar2;
                int i14 = this._inputPtr;
                if (i14 < this._inputEnd) {
                    char[] cArr5 = this._inputBuffer;
                    this._inputPtr = i14 + 1;
                    nextChar2 = cArr5[i14];
                } else {
                    nextChar2 = getNextChar("expected a digit for number exponent");
                }
                i11 = i13;
            }
            nextChar = nextChar2;
            int i15 = 0;
            while (nextChar <= '9' && nextChar >= '0') {
                i15++;
                if (i11 >= emptyAndGetCurrentSegment.length) {
                    emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i11 = 0;
                }
                i3 = i11 + 1;
                emptyAndGetCurrentSegment[i11] = nextChar;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i5 = i15;
                    z2 = true;
                    break;
                }
                char[] cArr6 = this._inputBuffer;
                int i16 = this._inputPtr;
                this._inputPtr = i16 + 1;
                nextChar = cArr6[i16];
                i11 = i3;
            }
            i5 = i15;
            i3 = i11;
            if (i5 == 0) {
                reportUnexpectedNumberChar(nextChar, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(nextChar);
            }
        }
        this._textBuffer.setCurrentLength(i3);
        return reset(z, i7, i4, i5);
    }

    private final int _skipAfterComma2() throws IOException {
        char c2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/') {
                    _skipComment();
                } else if (c2 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _skipCComment() throws java.io.IOException {
        /*
            r3 = this;
        L0:
            int r0 = r3._inputPtr
            int r1 = r3._inputEnd
            if (r0 < r1) goto Lc
            boolean r0 = r3._loadMore()
            if (r0 == 0) goto L26
        Lc:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            int r2 = r1 + 1
            r3._inputPtr = r2
            char r0 = r0[r1]
            r1 = 42
            if (r0 > r1) goto L0
            if (r0 != r1) goto L3c
            int r0 = r3._inputEnd
            if (r2 < r0) goto L2d
            boolean r0 = r3._loadMore()
            if (r0 != 0) goto L2d
        L26:
            r0 = 0
            java.lang.String r1 = " in a comment"
            r3._reportInvalidEOF(r1, r0)
            return
        L2d:
            char[] r0 = r3._inputBuffer
            int r1 = r3._inputPtr
            char r0 = r0[r1]
            r2 = 47
            if (r0 != r2) goto L0
            int r1 = r1 + 1
            r3._inputPtr = r1
            return
        L3c:
            r1 = 32
            if (r0 >= r1) goto L0
            r1 = 10
            if (r0 != r1) goto L4d
            int r0 = r3._currInputRow
            int r0 = r0 + 1
            r3._currInputRow = r0
            r3._currInputRowStart = r2
            goto L0
        L4d:
            r1 = 13
            if (r0 != r1) goto L55
            r3._skipCR()
            goto L0
        L55:
            r1 = 9
            if (r0 == r1) goto L0
            r3._throwInvalidSpace(r0)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._skipCComment():void");
    }

    private final int _skipColon() throws IOException {
        int i2 = this._inputPtr;
        if (i2 + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char[] cArr = this._inputBuffer;
        char c2 = cArr[i2];
        if (c2 == ':') {
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c3 = cArr[i3];
            if (c3 > ' ') {
                if (c3 != '/' && c3 != '#') {
                    this._inputPtr = i3 + 1;
                    return c3;
                }
                return _skipColon2(true);
            }
            if (c3 == ' ' || c3 == '\t') {
                int i4 = i3 + 1;
                this._inputPtr = i4;
                char c4 = cArr[i4];
                if (c4 > ' ') {
                    if (c4 != '/' && c4 != '#') {
                        this._inputPtr = i4 + 1;
                        return c4;
                    }
                    return _skipColon2(true);
                }
            }
            return _skipColon2(true);
        }
        if (c2 == ' ' || c2 == '\t') {
            int i5 = i2 + 1;
            this._inputPtr = i5;
            c2 = cArr[i5];
        }
        if (c2 == ':') {
            int i6 = this._inputPtr + 1;
            this._inputPtr = i6;
            char c5 = cArr[i6];
            if (c5 > ' ') {
                if (c5 != '/' && c5 != '#') {
                    this._inputPtr = i6 + 1;
                    return c5;
                }
                return _skipColon2(true);
            }
            if (c5 == ' ' || c5 == '\t') {
                int i7 = i6 + 1;
                this._inputPtr = i7;
                char c6 = cArr[i7];
                if (c6 > ' ') {
                    if (c6 != '/' && c6 != '#') {
                        this._inputPtr = i7 + 1;
                        return c6;
                    }
                    return _skipColon2(true);
                }
            }
            return _skipColon2(true);
        }
        return _skipColon2(false);
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/') {
                    _skipComment();
                } else if (c2 != '#' || !_skipYAMLComment()) {
                    if (z) {
                        return c2;
                    }
                    if (c2 != ':') {
                        _reportUnexpectedChar(c2, "was expecting a colon to separate field name and value");
                    }
                    z = true;
                }
            } else if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private final int _skipComma(int i2) throws IOException {
        if (i2 != 44) {
            _reportUnexpectedChar(i2, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        while (true) {
            int i3 = this._inputPtr;
            if (i3 < this._inputEnd) {
                char[] cArr = this._inputBuffer;
                int i4 = i3 + 1;
                this._inputPtr = i4;
                char c2 = cArr[i3];
                if (c2 > ' ') {
                    if (c2 != '/' && c2 != '#') {
                        return c2;
                    }
                    this._inputPtr = i4 - 1;
                    return _skipAfterComma2();
                }
                if (c2 < ' ') {
                    if (c2 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i4;
                    } else if (c2 == '\r') {
                        _skipCR();
                    } else if (c2 != '\t') {
                        _throwInvalidSpace(c2);
                    }
                }
            } else {
                return _skipAfterComma2();
            }
        }
    }

    private void _skipComment() throws IOException {
        if (!isEnabled(JsonParser.Feature.ALLOW_COMMENTS)) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        char c2 = cArr[i2];
        if (c2 == '/') {
            _skipLine();
        } else if (c2 == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c2, "was expecting either '*' or '/' for a comment");
        }
    }

    private void _skipLine() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            char c2 = cArr[i2];
            if (c2 < ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                    return;
                } else if (c2 == '\r') {
                    _skipCR();
                    return;
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        char c2 = cArr[i2];
        if (c2 > ' ') {
            if (c2 != '/' && c2 != '#') {
                return c2;
            }
            this._inputPtr = i3 - 1;
            return _skipWSOrEnd2();
        }
        if (c2 != ' ') {
            if (c2 == '\n') {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (c2 == '\r') {
                _skipCR();
            } else if (c2 != '\t') {
                _throwInvalidSpace(c2);
            }
        }
        while (true) {
            int i4 = this._inputPtr;
            if (i4 < this._inputEnd) {
                char[] cArr2 = this._inputBuffer;
                int i5 = i4 + 1;
                this._inputPtr = i5;
                char c3 = cArr2[i4];
                if (c3 > ' ') {
                    if (c3 != '/' && c3 != '#') {
                        return c3;
                    }
                    this._inputPtr = i5 - 1;
                    return _skipWSOrEnd2();
                }
                if (c3 != ' ') {
                    if (c3 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i5;
                    } else if (c3 == '\r') {
                        _skipCR();
                    } else if (c3 != '\t') {
                        _throwInvalidSpace(c3);
                    }
                }
            } else {
                return _skipWSOrEnd2();
            }
        }
    }

    private int _skipWSOrEnd2() throws IOException {
        char c2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            int i3 = i2 + 1;
            this._inputPtr = i3;
            c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/') {
                    _skipComment();
                } else if (c2 != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c2 != ' ') {
                if (c2 == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i3;
                } else if (c2 == '\r') {
                    _skipCR();
                } else if (c2 != '\t') {
                    _throwInvalidSpace(c2);
                }
            }
        }
        return c2;
    }

    private boolean _skipYAMLComment() throws IOException {
        if (!isEnabled(JsonParser.Feature.ALLOW_YAML_COMMENTS)) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _updateLocation() {
        int i2 = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i2;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i2 - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        int i2 = this._inputPtr;
        this._nameStartOffset = i2;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i2 - this._currInputRowStart;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r0 == '0') goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r5._inputPtr < r5._inputEnd) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (_loadMore() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        r0 = r5._inputBuffer;
        r3 = r5._inputPtr;
        r0 = r0[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r0 < '0') goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        if (r0 <= '9') goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r5._inputPtr = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r0 == '0') goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        return '0';
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private char _verifyNLZ2() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5._inputPtr
            int r1 = r5._inputEnd
            r2 = 48
            if (r0 < r1) goto Lf
            boolean r0 = r5._loadMore()
            if (r0 != 0) goto Lf
            return r2
        Lf:
            char[] r0 = r5._inputBuffer
            int r1 = r5._inputPtr
            char r0 = r0[r1]
            if (r0 < r2) goto L51
            r1 = 57
            if (r0 <= r1) goto L1c
            goto L51
        L1c:
            com.fasterxml.jackson.core.JsonParser$Feature r3 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS
            boolean r3 = r5.isEnabled(r3)
            if (r3 != 0) goto L29
            java.lang.String r3 = "Leading zeroes not allowed"
            r5.reportInvalidNumber(r3)
        L29:
            int r3 = r5._inputPtr
            int r3 = r3 + 1
            r5._inputPtr = r3
            if (r0 != r2) goto L50
        L31:
            int r3 = r5._inputPtr
            int r4 = r5._inputEnd
            if (r3 < r4) goto L3d
            boolean r3 = r5._loadMore()
            if (r3 == 0) goto L50
        L3d:
            char[] r0 = r5._inputBuffer
            int r3 = r5._inputPtr
            char r0 = r0[r3]
            if (r0 < r2) goto L4f
            if (r0 <= r1) goto L48
            goto L4f
        L48:
            int r3 = r3 + 1
            r5._inputPtr = r3
            if (r0 == r2) goto L31
            goto L50
        L4f:
            return r2
        L50:
            return r0
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._verifyNLZ2():char");
    }

    private final char _verifyNoLeadingZeroes() throws IOException {
        char c2;
        int i2 = this._inputPtr;
        if (i2 >= this._inputEnd || ((c2 = this._inputBuffer[i2]) >= '0' && c2 <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
    }

    private final void _verifyRootSpace(int i2) throws IOException {
        int i3 = this._inputPtr + 1;
        this._inputPtr = i3;
        if (i2 != 9) {
            if (i2 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i2 == 13) {
                _skipCR();
            } else if (i2 != 32) {
                _reportMissingRootWS(i2);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _closeInput() throws IOException {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    protected byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char < 0) {
                    if (c2 == '\"') {
                        return _getByteArrayBuilder.toByteArray();
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                char c3 = cArr2[i3];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c3, 1);
                }
                int i4 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i5 = this._inputPtr;
                this._inputPtr = i5 + 1;
                char c4 = cArr3[i5];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c4 == '\"' && !base64Variant.usesPadding()) {
                            _getByteArrayBuilder.append(i4 >> 4);
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c4, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i6 = this._inputPtr;
                        this._inputPtr = i6 + 1;
                        char c5 = cArr4[i6];
                        if (base64Variant.usesPaddingChar(c5)) {
                            _getByteArrayBuilder.append(i4 >> 4);
                        } else {
                            throw reportInvalidBase64Char(base64Variant, c5, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i7 = (i4 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                char c6 = cArr5[i8];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c6);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c6 == '\"' && !base64Variant.usesPadding()) {
                            _getByteArrayBuilder.appendTwoBytes(i7 >> 2);
                            return _getByteArrayBuilder.toByteArray();
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c6, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        _getByteArrayBuilder.appendTwoBytes(i7 >> 2);
                    }
                }
                _getByteArrayBuilder.appendThreeBytes((i7 << 6) | decodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        char c2 = cArr[i2];
        if (c2 == '\"' || c2 == '/' || c2 == '\\') {
            return c2;
        }
        if (c2 == 'b') {
            return '\b';
        }
        if (c2 == 'f') {
            return '\f';
        }
        if (c2 == 'n') {
            return '\n';
        }
        if (c2 == 'r') {
            return '\r';
        }
        if (c2 == 't') {
            return '\t';
        }
        if (c2 != 'u') {
            return _handleUnrecognizedCharacterEscape(c2);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c3 = cArr2[i5];
            int charToHex = CharTypes.charToHex(c3);
            if (charToHex < 0) {
                _reportUnexpectedChar(c3, "expected a hex-digit for character escape sequence");
            }
            i3 = (i3 << 4) | charToHex;
        }
        return (char) i3;
    }

    protected final void _finishString() throws IOException {
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        if (i2 < i3) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c2 = cArr[i2];
                if (c2 >= length || iArr[c2] == 0) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                } else if (c2 == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i4 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i4, i2 - i4);
                    this._inputPtr = i2 + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i5, i2 - i5);
        this._inputPtr = i2;
        _finishString2();
    }

    protected void _finishString2() throws IOException {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = cArr[i2];
            if (c2 < length && iArr[c2] != 0) {
                if (c2 == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c2 == '\\') {
                    c2 = _decodeEscaped();
                } else if (c2 < ' ') {
                    _throwUnquotedSpace(c2, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c2;
            currentSegmentSize++;
        }
    }

    protected final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id == 5) {
            return this._parsingContext.getCurrentName();
        }
        if (id != 6 && id != 7 && id != 8) {
            return jsonToken.asString();
        }
        return this._textBuffer.contentsAsString();
    }

    protected JsonToken _handleApos() throws IOException {
        char[] emptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    c2 = _decodeEscaped();
                } else if (c2 <= '\'') {
                    if (c2 == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    }
                    if (c2 < ' ') {
                        _throwUnquotedSpace(c2, "string value");
                    }
                }
            }
            if (currentSegmentSize >= emptyAndGetCurrentSegment.length) {
                emptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            emptyAndGetCurrentSegment[currentSegmentSize] = c2;
            currentSegmentSize++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r9v0 ??, r9v1 ??, r9v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r9 < r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r5 = r8._inputBuffer;
        r6 = r5[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        if (r6 >= r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r0[r6] == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        r3 = (r3 * 33) + r6;
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r9 < r4) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        r0 = r8._inputPtr - 1;
        r8._inputPtr = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        return r8._symbols.findSymbol(r5, r0, r9 - r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if (java.lang.Character.isJavaIdentifierPart(r6) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r0 = r8._inputPtr - 1;
        r8._inputPtr = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        return r8._symbols.findSymbol(r8._inputBuffer, r0, r9 - r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0076, code lost:
    
        r1 = r8._inputPtr - 1;
        r8._inputPtr = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
    
        return _handleOddName2(r1, r3, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.String _handleOddName(int r9) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 39
            if (r9 != r0) goto L11
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r8.isEnabled(r0)
            if (r0 == 0) goto L11
            java.lang.String r9 = r8._parseAposName()
            return r9
        L11:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES
            boolean r0 = r8.isEnabled(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "was expecting double-quote to start field name"
            r8._reportUnexpectedChar(r9, r0)
        L1e:
            int[] r0 = com.fasterxml.jackson.core.io.CharTypes.getInputCodeLatin1JsNames()
            int r1 = r0.length
            r2 = 1
            if (r9 >= r1) goto L2e
            r3 = r0[r9]
            if (r3 != 0) goto L2c
            r3 = 1
            goto L33
        L2c:
            r3 = 0
            goto L33
        L2e:
            char r3 = (char) r9
            boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
        L33:
            if (r3 != 0) goto L3a
            java.lang.String r3 = "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name"
            r8._reportUnexpectedChar(r9, r3)
        L3a:
            int r9 = r8._inputPtr
            int r3 = r8._hashSeed
            int r4 = r8._inputEnd
            if (r9 >= r4) goto L76
        L42:
            char[] r5 = r8._inputBuffer
            char r6 = r5[r9]
            if (r6 >= r1) goto L59
            r7 = r0[r6]
            if (r7 == 0) goto L6f
            int r0 = r8._inputPtr
            int r0 = r0 - r2
            r8._inputPtr = r9
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r1 = r8._symbols
            int r9 = r9 - r0
            java.lang.String r9 = r1.findSymbol(r5, r0, r9, r3)
            return r9
        L59:
            char r5 = (char) r6
            boolean r5 = java.lang.Character.isJavaIdentifierPart(r5)
            if (r5 != 0) goto L6f
            int r0 = r8._inputPtr
            int r0 = r0 - r2
            r8._inputPtr = r9
            com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer r1 = r8._symbols
            char[] r2 = r8._inputBuffer
            int r9 = r9 - r0
            java.lang.String r9 = r1.findSymbol(r2, r0, r9, r3)
            return r9
        L6f:
            int r3 = r3 * 33
            int r3 = r3 + r6
            int r9 = r9 + 1
            if (r9 < r4) goto L42
        L76:
            int r1 = r8._inputPtr
            int r1 = r1 - r2
            r8._inputPtr = r9
            java.lang.String r9 = r8._handleOddName2(r1, r3, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddName(int):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
    
        if (r4 != 44) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected com.fasterxml.jackson.core.JsonToken _handleOddValue(int r4) throws java.io.IOException {
        /*
            r3 = this;
            r0 = 39
            if (r4 == r0) goto L89
            r0 = 73
            r1 = 1
            if (r4 == r0) goto L6f
            r0 = 78
            if (r4 == r0) goto L55
            r0 = 93
            if (r4 == r0) goto L3c
            r0 = 43
            if (r4 == r0) goto L1b
            r0 = 44
            if (r4 == r0) goto L45
            goto L96
        L1b:
            int r4 = r3._inputPtr
            int r0 = r3._inputEnd
            if (r4 < r0) goto L2c
            boolean r4 = r3._loadMore()
            if (r4 != 0) goto L2c
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NUMBER_INT
            r3._reportInvalidEOFInValue(r4)
        L2c:
            char[] r4 = r3._inputBuffer
            int r0 = r3._inputPtr
            int r1 = r0 + 1
            r3._inputPtr = r1
            char r4 = r4[r0]
            r0 = 0
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleInvalidNumberStart(r4, r0)
            return r4
        L3c:
            com.fasterxml.jackson.core.json.JsonReadContext r0 = r3._parsingContext
            boolean r0 = r0.inArray()
            if (r0 != 0) goto L45
            goto L96
        L45:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_MISSING_VALUES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L96
            int r4 = r3._inputPtr
            int r4 = r4 - r1
            r3._inputPtr = r4
            com.fasterxml.jackson.core.JsonToken r4 = com.fasterxml.jackson.core.JsonToken.VALUE_NULL
            return r4
        L55:
            java.lang.String r0 = "NaN"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L69
            r1 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L69:
            java.lang.String r0 = "Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L96
        L6f:
            java.lang.String r0 = "Infinity"
            r3._matchToken(r0, r1)
            com.fasterxml.jackson.core.JsonParser$Feature r1 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS
            boolean r1 = r3.isEnabled(r1)
            if (r1 == 0) goto L83
            r1 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            com.fasterxml.jackson.core.JsonToken r4 = r3.resetAsNaN(r0, r1)
            return r4
        L83:
            java.lang.String r0 = "Non-standard token 'Infinity': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow"
            r3._reportError(r0)
            goto L96
        L89:
            com.fasterxml.jackson.core.JsonParser$Feature r0 = com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES
            boolean r0 = r3.isEnabled(r0)
            if (r0 == 0) goto L96
            com.fasterxml.jackson.core.JsonToken r4 = r3._handleApos()
            return r4
        L96:
            boolean r0 = java.lang.Character.isJavaIdentifierStart(r4)
            if (r0 == 0) goto Lb3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r1 = (char) r4
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "('true', 'false' or 'null')"
            r3._reportInvalidToken(r0, r1)
        Lb3:
            java.lang.String r0 = "expected a valid value (number, String, array, object, 'true', 'false' or 'null')"
            r3._reportUnexpectedChar(r4, r0)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser._handleOddValue(int):com.fasterxml.jackson.core.JsonToken");
    }

    protected boolean _loadMore() throws IOException {
        int i2 = this._inputEnd;
        long j2 = i2;
        this._currInputProcessed += j2;
        this._currInputRowStart -= i2;
        this._nameStartOffset -= j2;
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this._inputPtr = 0;
                this._inputEnd = read;
                return true;
            }
            _closeInput();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
        }
        return false;
    }

    protected void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    protected final void _matchToken(String str, int i2) throws IOException {
        int i3;
        char c2;
        int length = str.length();
        do {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidToken(str.substring(0, i2));
            }
            if (this._inputBuffer[this._inputPtr] != str.charAt(i2)) {
                _reportInvalidToken(str.substring(0, i2));
            }
            i3 = this._inputPtr + 1;
            this._inputPtr = i3;
            i2++;
        } while (i2 < length);
        if ((i3 < this._inputEnd || _loadMore()) && (c2 = this._inputBuffer[this._inputPtr]) >= '0' && c2 != ']' && c2 != '}' && Character.isJavaIdentifierPart(c2)) {
            _reportInvalidToken(str.substring(0, i2));
        }
    }

    protected String _parseAposName() throws IOException {
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int i4 = this._inputEnd;
        if (i2 < i4) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c2 = cArr[i2];
                if (c2 == '\'') {
                    int i5 = this._inputPtr;
                    this._inputPtr = i2 + 1;
                    return this._symbols.findSymbol(cArr, i5, i2 - i5, i3);
                }
                if (c2 < length && iArr[c2] != 0) {
                    break;
                }
                i3 = (i3 * 33) + c2;
                i2++;
            } while (i2 < i4);
        }
        int i6 = this._inputPtr;
        this._inputPtr = i2;
        return _parseName2(i6, i3, 39);
    }

    protected final String _parseName() throws IOException {
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i2 >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c2 = cArr[i2];
            if (c2 >= iArr.length || iArr[c2] == 0) {
                i3 = (i3 * 33) + c2;
                i2++;
            } else if (c2 == '\"') {
                int i4 = this._inputPtr;
                this._inputPtr = i2 + 1;
                return this._symbols.findSymbol(cArr, i4, i2 - i4, i3);
            }
        }
        int i5 = this._inputPtr;
        this._inputPtr = i2;
        return _parseName2(i5, i3, 34);
    }

    protected final JsonToken _parseNegNumber() throws IOException {
        int i2 = this._inputPtr;
        int i3 = i2 - 1;
        int i4 = this._inputEnd;
        if (i2 >= i4) {
            return _parseNumber2(true, i3);
        }
        int i5 = i2 + 1;
        char c2 = this._inputBuffer[i2];
        if (c2 > '9' || c2 < '0') {
            this._inputPtr = i5;
            return _handleInvalidNumberStart(c2, true);
        }
        if (c2 == '0') {
            return _parseNumber2(true, i3);
        }
        int i6 = 1;
        while (i5 < i4) {
            int i7 = i5 + 1;
            char c3 = this._inputBuffer[i5];
            if (c3 < '0' || c3 > '9') {
                if (c3 != '.' && c3 != 'e' && c3 != 'E') {
                    int i8 = i7 - 1;
                    this._inputPtr = i8;
                    if (this._parsingContext.inRoot()) {
                        _verifyRootSpace(c3);
                    }
                    this._textBuffer.resetWithShared(this._inputBuffer, i3, i8 - i3);
                    return resetInt(true, i6);
                }
                this._inputPtr = i7;
                return _parseFloat(c3, i3, i7, true, i6);
            }
            i6++;
            i5 = i7;
        }
        return _parseNumber2(true, i3);
    }

    protected final JsonToken _parsePosNumber(int i2) throws IOException {
        int i3 = this._inputPtr;
        int i4 = i3 - 1;
        int i5 = this._inputEnd;
        if (i2 == 48) {
            return _parseNumber2(false, i4);
        }
        int i6 = 1;
        while (i3 < i5) {
            int i7 = i3 + 1;
            char c2 = this._inputBuffer[i3];
            if (c2 < '0' || c2 > '9') {
                if (c2 != '.' && c2 != 'e' && c2 != 'E') {
                    int i8 = i7 - 1;
                    this._inputPtr = i8;
                    if (this._parsingContext.inRoot()) {
                        _verifyRootSpace(c2);
                    }
                    this._textBuffer.resetWithShared(this._inputBuffer, i4, i8 - i4);
                    return resetInt(false, i6);
                }
                this._inputPtr = i7;
                return _parseFloat(c2, i4, i7, false, i6);
            }
            i6++;
            i3 = i7;
        }
        this._inputPtr = i4;
        return _parseNumber2(false, i4);
    }

    protected int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i2;
        int length = bArr.length - 3;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c2 = cArr[i5];
            if (c2 > ' ') {
                int decodeBase64Char = base64Variant.decodeBase64Char(c2);
                if (decodeBase64Char < 0) {
                    if (c2 == '\"') {
                        break;
                    }
                    decodeBase64Char = _decodeBase64Escape(base64Variant, c2, 0);
                    if (decodeBase64Char < 0) {
                        continue;
                    }
                }
                if (i3 > length) {
                    i4 += i3;
                    outputStream.write(bArr, 0, i3);
                    i3 = 0;
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                char c3 = cArr2[i6];
                int decodeBase64Char2 = base64Variant.decodeBase64Char(c3);
                if (decodeBase64Char2 < 0) {
                    decodeBase64Char2 = _decodeBase64Escape(base64Variant, c3, 1);
                }
                int i7 = (decodeBase64Char << 6) | decodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i8 = this._inputPtr;
                this._inputPtr = i8 + 1;
                char c4 = cArr3[i8];
                int decodeBase64Char3 = base64Variant.decodeBase64Char(c4);
                if (decodeBase64Char3 < 0) {
                    if (decodeBase64Char3 != -2) {
                        if (c4 == '\"' && !base64Variant.usesPadding()) {
                            bArr[i3] = (byte) (i7 >> 4);
                            i3++;
                            break;
                        }
                        decodeBase64Char3 = _decodeBase64Escape(base64Variant, c4, 2);
                    }
                    if (decodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i9 = this._inputPtr;
                        this._inputPtr = i9 + 1;
                        char c5 = cArr4[i9];
                        if (base64Variant.usesPaddingChar(c5)) {
                            i2 = i3 + 1;
                            bArr[i3] = (byte) (i7 >> 4);
                            i3 = i2;
                        } else {
                            throw reportInvalidBase64Char(base64Variant, c5, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                    }
                }
                int i10 = (i7 << 6) | decodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                char c6 = cArr5[i11];
                int decodeBase64Char4 = base64Variant.decodeBase64Char(c6);
                if (decodeBase64Char4 < 0) {
                    if (decodeBase64Char4 != -2) {
                        if (c6 == '\"' && !base64Variant.usesPadding()) {
                            int i12 = i10 >> 2;
                            int i13 = i3 + 1;
                            bArr[i3] = (byte) (i12 >> 8);
                            i3 = i13 + 1;
                            bArr[i13] = (byte) i12;
                            break;
                        }
                        decodeBase64Char4 = _decodeBase64Escape(base64Variant, c6, 3);
                    }
                    if (decodeBase64Char4 == -2) {
                        int i14 = i10 >> 2;
                        int i15 = i3 + 1;
                        bArr[i3] = (byte) (i14 >> 8);
                        i3 = i15 + 1;
                        bArr[i15] = (byte) i14;
                    }
                }
                int i16 = (i10 << 6) | decodeBase64Char4;
                int i17 = i3 + 1;
                bArr[i3] = (byte) (i16 >> 16);
                int i18 = i17 + 1;
                bArr[i17] = (byte) (i16 >> 8);
                i2 = i18 + 1;
                bArr[i18] = (byte) i16;
                i3 = i2;
            }
        }
        this._tokenIncomplete = false;
        if (i3 <= 0) {
            return i4;
        }
        int i19 = i4 + i3;
        outputStream.write(bArr, 0, i3);
        return i19;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    protected void _releaseBuffers() throws IOException {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (cArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = null;
        this._ioContext.releaseTokenBuffer(cArr);
    }

    protected void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, "'null', 'true', 'false' or NaN");
    }

    protected final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i2 = this._inputPtr;
            if (cArr[i2] == '\n') {
                this._inputPtr = i2 + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    protected final void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int i2 = this._inputPtr;
        int i3 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i2 >= i3) {
                this._inputPtr = i2;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i2 = this._inputPtr;
                i3 = this._inputEnd;
            }
            int i4 = i2 + 1;
            char c2 = cArr[i2];
            if (c2 <= '\\') {
                if (c2 == '\\') {
                    this._inputPtr = i4;
                    _decodeEscaped();
                    i2 = this._inputPtr;
                    i3 = this._inputEnd;
                } else if (c2 <= '\"') {
                    if (c2 == '\"') {
                        this._inputPtr = i4;
                        return;
                    } else if (c2 < ' ') {
                        this._inputPtr = i4;
                        _throwUnquotedSpace(c2, "string value");
                    }
                }
            }
            i2 = i4;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e2) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e2.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder _getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), _getByteArrayBuilder, base64Variant);
            this._binaryValue = _getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(this._ioContext.getSourceReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Deprecated
    protected char getNextChar(String str) throws IOException {
        return getNextChar(str, null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        return _getText2(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6) {
                if (id != 7 && id != 8) {
                    return this._currToken.asCharArray();
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextBuffer();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int id = jsonToken.id();
        if (id != 5) {
            if (id != 6) {
                if (id != 7 && id != 8) {
                    return this._currToken.asCharArray().length;
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.size();
        }
        return this._parsingContext.getCurrentName().length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int getTextOffset() throws java.io.IOException {
        /*
            r3 = this;
            com.fasterxml.jackson.core.JsonToken r0 = r3._currToken
            r1 = 0
            if (r0 == 0) goto L24
            int r0 = r0.id()
            r2 = 6
            if (r0 == r2) goto L14
            r2 = 7
            if (r0 == r2) goto L1d
            r2 = 8
            if (r0 == r2) goto L1d
            goto L24
        L14:
            boolean r0 = r3._tokenIncomplete
            if (r0 == 0) goto L1d
            r3._tokenIncomplete = r1
            r3._finishString()
        L1d:
            com.fasterxml.jackson.core.util.TextBuffer r0 = r3._textBuffer
            int r0 = r0.getTextOffset()
            return r0
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.json.ReaderBasedJsonParser.getTextOffset():int");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        Object sourceReference = this._ioContext.getSourceReference();
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new JsonLocation(sourceReference, -1L, (this._nameStartOffset - 1) + this._currInputProcessed, this._nameStartRow, this._nameStartCol);
        }
        return new JsonLocation(sourceReference, -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken _parseNegNumber;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (_skipWSOrEnd == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String _parseName = _skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd);
        this._parsingContext.setCurrentName(_parseName);
        this._currToken = jsonToken2;
        int _skipColon = _skipColon();
        _updateLocation();
        if (_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return _parseName;
        }
        if (_skipColon == 45) {
            _parseNegNumber = _parseNegNumber();
        } else if (_skipColon == 91) {
            _parseNegNumber = JsonToken.START_ARRAY;
        } else if (_skipColon == 102) {
            _matchFalse();
            _parseNegNumber = JsonToken.VALUE_FALSE;
        } else if (_skipColon == 110) {
            _matchNull();
            _parseNegNumber = JsonToken.VALUE_NULL;
        } else if (_skipColon == 116) {
            _matchTrue();
            _parseNegNumber = JsonToken.VALUE_TRUE;
        } else if (_skipColon != 123) {
            switch (_skipColon) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    _parseNegNumber = _parsePosNumber(_skipColon);
                    break;
                default:
                    _parseNegNumber = _handleOddValue(_skipColon);
                    break;
            }
        } else {
            _parseNegNumber = JsonToken.START_OBJECT;
        }
        this._nextToken = _parseNegNumber;
        return _parseName;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String nextTextValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final JsonToken nextToken() throws IOException {
        JsonToken jsonToken;
        JsonToken jsonToken2 = this._currToken;
        JsonToken jsonToken3 = JsonToken.FIELD_NAME;
        if (jsonToken2 == jsonToken3) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int _skipWSOrEnd = _skipWSOrEnd();
        if (_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (_skipWSOrEnd == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            JsonToken jsonToken4 = JsonToken.END_ARRAY;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (_skipWSOrEnd == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(_skipWSOrEnd, ']');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            JsonToken jsonToken5 = JsonToken.END_OBJECT;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (this._parsingContext.expectComma()) {
            _skipWSOrEnd = _skipComma(_skipWSOrEnd);
        }
        boolean inObject = this._parsingContext.inObject();
        if (inObject) {
            _updateNameLocation();
            this._parsingContext.setCurrentName(_skipWSOrEnd == 34 ? _parseName() : _handleOddName(_skipWSOrEnd));
            this._currToken = jsonToken3;
            _skipWSOrEnd = _skipColon();
        }
        _updateLocation();
        if (_skipWSOrEnd == 34) {
            this._tokenIncomplete = true;
            jsonToken = JsonToken.VALUE_STRING;
        } else if (_skipWSOrEnd == 45) {
            jsonToken = _parseNegNumber();
        } else if (_skipWSOrEnd == 91) {
            if (!inObject) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            }
            jsonToken = JsonToken.START_ARRAY;
        } else if (_skipWSOrEnd == 102) {
            _matchFalse();
            jsonToken = JsonToken.VALUE_FALSE;
        } else if (_skipWSOrEnd != 110) {
            if (_skipWSOrEnd != 116) {
                if (_skipWSOrEnd == 123) {
                    if (!inObject) {
                        this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                    }
                    jsonToken = JsonToken.START_OBJECT;
                } else if (_skipWSOrEnd != 125) {
                    switch (_skipWSOrEnd) {
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                            jsonToken = _parsePosNumber(_skipWSOrEnd);
                            break;
                        default:
                            jsonToken = _handleOddValue(_skipWSOrEnd);
                            break;
                    }
                } else {
                    _reportUnexpectedChar(_skipWSOrEnd, "expected a value");
                }
            }
            _matchTrue();
            jsonToken = JsonToken.VALUE_TRUE;
        } else {
            _matchNull();
            jsonToken = JsonToken.VALUE_NULL;
        }
        if (inObject) {
            this._nextToken = jsonToken;
            return this._currToken;
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (this._tokenIncomplete && this._currToken == JsonToken.VALUE_STRING) {
            byte[] allocBase64Buffer = this._ioContext.allocBase64Buffer();
            try {
                return _readBinary(base64Variant, outputStream, allocBase64Buffer);
            } finally {
                this._ioContext.releaseBase64Buffer(allocBase64Buffer);
            }
        }
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    protected void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c2 = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c2)) {
                break;
            }
            this._inputPtr++;
            sb.append(c2);
        }
        _reportError("Unrecognized token '" + sb.toString() + "': was expecting " + str2);
    }

    protected char getNextChar(String str, JsonToken jsonToken) throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i2 = this._inputPtr;
        this._inputPtr = i2 + 1;
        return cArr[i2];
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i2, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i2);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
    }
}
