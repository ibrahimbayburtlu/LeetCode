

char * defangIPaddr(char * address){

    char *d = calloc(1,sizeof("xxx[.]xxx[i]xxx[i]xxx"));
    char *t = d;
    for (char *a = address; *a ; a++){
        *a == '.' ? *d++ = '[', *d++ = '.' , *d++ = ']' : (*d++ = *a);
    }
    return t;
}