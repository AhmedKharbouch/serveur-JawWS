# serveur-JawWS
creation d'un server jawWS

## creation de classe Compte 
>Annotation: 
>
>>-XmlRootElement (pour donner renommer la classe dans le fichier wsdl)
>
>>-XMLTransient (pour ignorer un attribut)
>
>>-XmlAccessorType :  est une annotation Java utilisée pour spécifier le type d'accès pour les champs lorsqu'ils sont marshallés et démarshallés 
 par le cadre JAXB (Java Architecture for XML Binding).
 >
>![compte class](https://user-images.githubusercontent.com/102327247/213424452-da57e8a5-2d5f-4c64-a8dd-7e813a11e7d7.PNG)

## Création d'apis 

>![apis](https://user-images.githubusercontent.com/102327247/213426072-4ea6a05e-8ff8-46db-8d67-edbd02c97ebf.PNG)

## creation du serveur et demarrage

>![serveur demarer](https://user-images.githubusercontent.com/102327247/213426941-0f75397a-084f-49a5-80dc-b9ef9dca088f.PNG)

## Test des apis avec SOAP UI

>#Transiant Test
>
>>![xmlTransiantSoap](https://user-images.githubusercontent.com/102327247/213427180-bfdd5b60-0062-4cf3-ad65-00e155b2e36d.PNG)
>>
>#List Compte Test
>
>>![ListCompteSoap](https://user-images.githubusercontent.com/102327247/213427250-7ad14160-2ae7-4812-82a7-f97141bda762.PNG)
>>
>#Get Compte Test
>
>>![gestCompteSoap](https://user-images.githubusercontent.com/102327247/213427455-1b1f8650-bdf0-4151-be7a-b3db1de6e06f.PNG)
>>
>#Conversion Test
>
>>![converstionSoap](https://user-images.githubusercontent.com/102327247/213427597-9f1b659b-4e15-4f59-a175-4396ae1e6d49.PNG)

