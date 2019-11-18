export class Product {
constructor(
    public pname: string,
    public category: string,
    public imgURL: string,
    public price: number,
    public details: string,
    public pk ?: string
    ) {}
}
