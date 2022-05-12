<h2>String클래스의 intern() 메소드 설명 </h2><br>

Returns a canonical representation for the string object.
 <p>
 A pool of strings, initially empty, is maintained privately by the
 class {@code String}.
 <p>
 When the intern method is invoked, if the pool already contains a
 string equal to this {@code String} object as determined by
 the {@link #equals(Object)} method, then the string from the pool is
 returned. Otherwise, this {@code String} object is added to the
 pool and a reference to this {@code String} object is returned.
 <p>
 It follows that for any two strings {@code s} and {@code t},
 {@code s.intern() == t.intern()} is {@code true}
 if and only if {@code s.equals(t)} is {@code true}.
 <p>
 All literal strings and string-valued constant expressions are
 interned. String literals are defined in section 3.10.5 of the
 <cite>The Java&trade; Language Specification</cite>.

@return a string that has the same contents as this string, but is guaranteed to be from a pool of unique strings. @jls
3.10.5 String Literals

---
---

문자열 개체에 대한 표준 표현을 반환합니다.
<p>
 처음에는 비어 있는 문자열 풀은 비공개로 유지 관리됩니다.
 클래스 {@code 문자열}.
 <p>
 인턴 메소드가 호출될 때 풀에 이미
 다음에 의해 결정된 이 {@code String} 객체와 동일한 문자열
 {@link #equals(Object)} 메서드인 경우 풀의 문자열은
 반환되었습니다. 그렇지 않으면 이 {@code String} 개체가
 풀 및 이 {@code String} 개체에 대한 참조가 반환됩니다.
 <p>
 두 문자열 {@code s} 및 {@code t}에 대해
 {@code s.intern() == t.intern()}은 {@code true}입니다.
 {@code s.equals(t)}가 {@code true}인 경우에만.
 <p>
 모든 리터럴 문자열과 문자열 값 상수 표현식은
 인턴. 문자열 리터럴은 섹션 3.10.5에 정의되어 있습니다.
 <cite>자바&trade; 언어 사양</cite>.

@return 이 문자열과 내용이 같지만 고유 문자열 풀에서 보장됩니다. @jls 3.10.5 문자열 리터럴